package ru.baccasoft;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import ru.baccasoft.emr.thrift.generated.ThriftCaseData;
import ru.baccasoft.emr.thrift.generated.ThriftPatientService;

import java.util.List;

public class EMRClient {

    private static final String PATIENT_ID_1 = "'01009006987^^^&1.3.6.1.4.1.21367.2005.3.7&ISO'";
    //private static final String PATIENT_ID_2 = "'UNK1376427397^^^&1.3.6.1.4.1.21367.2005.3.7&ISO'";
    private final static String REMOTE_ADDRESS = "http://92.51.96.102:80/ThriftPatientServlet";

    public static void main(String[] args) {

        System.out.println("Test console application");
        System.out.println("Args count - " + args.length);
        List<ThriftCaseData> emrCases;
        Timing timing;
        String patientID = "";

        try {

            if (args.length != 1) {
                patientID = PATIENT_ID_1;
                System.out.println("Patient ID is missing. Will be use " + patientID + " patient ID.\n");
             }
            else
                patientID = args[0].toUpperCase();

            timing = new Timing();

            // Create Transport. HTTP Type
            TTransport transport;
            transport = new THttpClient(REMOTE_ADDRESS);
            transport.open();

            // Create TProtocol. Binary Type
            TProtocol protocol = new  TBinaryProtocol(transport);
            // TProtocol protocol = new TJSONProtocol(transport); // лучше череез JSON передавать

            // Create ThriftPatientService client
            ThriftPatientService.Client client = new ThriftPatientService.Client(protocol);

            // Send request getPatientCases
            System.out.println("Request " + patientID + " patient cases...");

            timing.start();
            emrCases = client.getPatientCases(patientID,"","");
            timing.stop();
            System.out.println(timing.toString());

            // Print result
            String casesOutputString = "";
            int i=1;
            for(ThriftCaseData caseEMR: emrCases) {
                casesOutputString += "# " + i++ + "\n" +
                        caseEMR.toString() + "\n";
            }
            System.out.println("Result:\n" + casesOutputString);

            // Close transport
            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }
}