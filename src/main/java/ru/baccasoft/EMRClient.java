package ru.baccasoft;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import ru.baccasoft.emr.thrift.generated.*;

import java.util.List;

public class EMRClient {

    private static final String PATIENT_ID_1 = "'01009006987^^^&1.3.6.1.4.1.21367.2005.3.7&ISO'";
    private static final String PATIENT_ID_2 = "'843018^^^&1.3.6.1.4.1.21367.2005.3.7&ISO'";
    private final static String REMOTE_ADDRESS_PATIENT = "http://92.51.96.102:80/ThriftPatientServlet";
    private final static String REMOTE_ADDRESS_DOCTOR = "http://92.51.96.102:80/ThriftDoctorServlet";
    private static final String CASE_ID1 = "5a6fc281-5fb5-4422-a412-74a649cfd871";
    private static final String CASE_ID2 = "debb3f16-3ab9-4878-a3b8-1d5f742d3f64";

    public static void main(String[] args) {

        System.out.println("Test console application");
        System.out.println("Args count - " + args.length);
        List<ThriftCaseData> emrCases;
        ThriftCaseDetailData emrCasesDetails;

        Timing timing;
        String patientID;

        String casesOutputString;

        try {

            if (args.length != 1) {
                patientID = PATIENT_ID_2;
                System.out.println("Patient ID is missing. Will be use " + patientID + " patient ID.\n");
             }
            else
                patientID = args[0].toUpperCase();



            timing = new Timing();

            //////////////  ThriftPatientService //////////////////////////
            // Create Transport. HTTP Type
            TTransport transport;
            transport = new THttpClient(REMOTE_ADDRESS_PATIENT);
            transport.open();

            // Create TProtocol. Binary Type
            TProtocol protocol = new  TBinaryProtocol(transport);
            // TProtocol protocol = new TJSONProtocol(transport); // пїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ JSON пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ


            // Create ThriftPatientService client
            ThriftPatientService.Client client = new ThriftPatientService.Client(protocol);

            // Send request getPatientCases
            System.out.println("Request " + patientID + " patient cases...");

            timing.start();
            emrCases = client.getPatientCases(patientID,"","");
            timing.stop();
            System.out.println(timing.toString());

            // Print result
            casesOutputString = "";
            int i=1;
            for(ThriftCaseData caseEMR: emrCases) {
                casesOutputString += "# " + i++ + "\n" +
                        caseEMR.toString() + "\n";
            }
            System.out.println("Result:\n" + casesOutputString);

            // Close transport
            transport.close();

            //////////////  ThriftCaseDetailData getCaseDetail //////////////////////////
            // Create getCaseDetail client

            // Create Transport. HTTP Type
            TTransport transport2;
            transport2 = new THttpClient(REMOTE_ADDRESS_DOCTOR);
            transport2.open();

            // Create TProtocol. Binary Type
            TProtocol protocol2 = new  TBinaryProtocol(transport2);
            // TProtocol protocol = new TJSONProtocol(transport); // пїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ JSON пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ


            ThriftDoctorService.Client clientDoctor = new ThriftDoctorService.Client(protocol2);


            for(ThriftCaseData caseEMR: emrCases) {


                // Send request getPatientCases
                System.out.println("Request case (" + caseEMR.caseID + ") details for patientID + " + patientID + "\n");

                timing.start();
                emrCasesDetails = clientDoctor.getCaseDetail(caseEMR.caseID, patientID);
                timing.stop();
                System.out.println(timing.toString());

                // Print result

                int j = 1;
                casesOutputString = "encounterData -" + emrCasesDetails.encounterData.toString() + "\n";
                casesOutputString += "ProblemData(" + emrCasesDetails.problemData.size() + ")\n";
                for (ThriftSectionProblemData problems : emrCasesDetails.problemData) {
                    casesOutputString += problems.toString() + "\n";
                }
                casesOutputString += "procedureData(" + emrCasesDetails.procedureData.size() + ")\n";
                for (ThriftSectionProcedureData procedure : emrCasesDetails.procedureData) {
                    casesOutputString += procedure.toString() + "\n";
                }
                casesOutputString += "medicationData(" + emrCasesDetails.medicationData.size() + ")\n";
                for (ThriftSectionMedicationData medication : emrCasesDetails.medicationData) {
                    casesOutputString += medication.toString() + "\n";
                }
                System.out.println("Result:\n" + casesOutputString);

            }
            // Close transport
            transport2.close();

        } catch (TException x) {
            x.printStackTrace();
        }
    }
}