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

    private static final String PATIENT_NAME_1 =      "test";
    private static final String PATIENT_SURNAME_1 =      "test";
    private static final String PATIENT_dateOfBirth_1 =      "19801226"; //дате рождения(YYYYMMDD)
    private static final String PATIENT_NATIONAL_ID_1 =      "01009006987";
    private static final String PATIENT_ID_1 = "'01009006987^^^&1.3.6.1.4.1.21367.2005.3.7&ISO'";
    private static final String PATIENT_ID_1_PASS =      "123";
    private static final String PATIENT_NATIONAL_ID_2 =      "843018";
    private static final String PATIENT_ID_2 =      "'843018^^^&1.3.6.1.4.1.21367.2005.3.7&ISO'";
    private static final String PATIENT_ID_2_PASS =      "123";
    private final static String REMOTE_ADDRESS_PATIENT = "http://92.51.96.102:80/ThriftPatientServlet";
    private final static String REMOTE_ADDRESS_DOCTOR = "http://92.51.96.102:80/ThriftDoctorServlet";
    private final static String REMOTE_ADDRESS_AUTH = "http://92.51.96.102:80/ThriftAuthServlet";

    private static final String CASE_ID1 = "5a6fc281-5fb5-4422-a412-74a649cfd871";
    private static final String CASE_ID2 = "debb3f16-3ab9-4878-a3b8-1d5f742d3f64";

    public static void main(String[] args) {

        System.out.println("Test console application");
        System.out.println("Args count - " + args.length);
        List<ThriftCaseData> emrCases;
        ThriftCaseDetailData emrCasesDetails;
        List<ThriftSectionMedicationData> medications;
        List<ThriftPatientPersonalData>  patients;

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

            //////////////  ThriftAuthService //////////////////////////
            // Create Transport. HTTP Type
            TTransport transport3;
            transport3 = new THttpClient(REMOTE_ADDRESS_AUTH);
            transport3.open();

            // Create TProtocol. Binary Type
            TProtocol protocol3 = new  TBinaryProtocol(transport3);
            // TProtocol protocol = new TJSONProtocol(transport); // пїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ JSON пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ

            // Create ThriftPatientService client
            ThriftAuthService.Client clientThriftAuthService = new ThriftAuthService.Client(protocol3);

            // Send request getPatientCases
            System.out.println("===================== Request " + PATIENT_NATIONAL_ID_1 + " patient; password " + PATIENT_ID_1_PASS +" ...");

            ThriftRequestCommonData authRequest = new ThriftRequestCommonData();
            authRequest.setUserLogin(PATIENT_NATIONAL_ID_1);
            authRequest.setPassword(PATIENT_ID_1_PASS);

            boolean isAuth;
            timing.start();
            isAuth = clientThriftAuthService.login(authRequest);
            timing.stop();
            System.out.println(timing.toString());

            if(isAuth)
                System.out.println("Authorisation [SUCCESSFUL]");
            else
                System.out.println("Authorisation [ERROR]");


            // Close transport
            transport3.close();


            //////////////  ThriftPatientService //////////////////////////
            // Create Transport. HTTP Type
            TTransport transport;
            transport = new THttpClient(REMOTE_ADDRESS_PATIENT);
            transport.open();

            // Create TProtocol. Binary Type
            TProtocol protocol = new  TBinaryProtocol(transport);
            // TProtocol protocol = new TJSONProtocol(transport); // пїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ JSON пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ


            // Create ThriftPatientService client
            ThriftPatientService.Client clientPatientService = new ThriftPatientService.Client(protocol);

            // Send request getPatientCases
            System.out.println("===================== Request " + patientID + " patient cases...");

            timing.start();
            emrCases = clientPatientService.getPatientCases(patientID,"","");
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


            //------------------------------ Medication ----------------------------------------------
            System.out.println("===================== Request My Medication for ID: " + patientID);

            timing.start();
            medications = clientPatientService.getPatientMedications(patientID);
            timing.stop();
            System.out.println(timing.toString());

            String medicationsOutputString  ="";
            for(ThriftSectionMedicationData medication: medications) {
                medicationsOutputString += medication.toString() + "\n";
            }

            System.out.println(medicationsOutputString);

            //--------------------------------end medication---------------------------------------------------------

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
                System.out.println("===================== Request case (" + caseEMR.caseID + ") details for patientID + " + patientID + "\n");

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


            //------------------------------ getPatientProfile ----------------------------------------------
            System.out.println("===================== Request Get Patient Profile for ID: " + PATIENT_NATIONAL_ID_1);

            ThriftPatientProfileData patientProfile;
            timing.start();
            patientProfile = clientDoctor.getPatientProfile(PATIENT_NATIONAL_ID_1);
            timing.stop();
            System.out.println(timing.toString());

            System.out.println(patientProfile.toString());

            //--------------------------------end getPatientProfile--------------------------------------------------


            //------------------------------ findPatientById ----------------------------------------------
            //Поиск пациента по Id, Id - не в ISO-формате!
            System.out.println("===================== Request findPatientByID: " + PATIENT_NATIONAL_ID_1);

            ThriftPatientPersonalData patientPersonalData;
            timing.start();
            patientPersonalData = clientDoctor.findPatientById(PATIENT_NATIONAL_ID_1);
            timing.stop();
            System.out.println(timing.toString());

            System.out.println(patientPersonalData.toString());

            //--------------------------------end getPatientProfile--------------------------------------------------

            //------------------------------ findPatientByName ----------------------------------------------
            //Поиск пациента по Id, Id - не в ISO-формате!
            System.out.println("===================== Request findPatientByName: " + PATIENT_NATIONAL_ID_1);

            //ThriftPatientPersonalData patientPersonalData;
            timing.start();
            patients = clientDoctor.findPatientByName(PATIENT_NAME_1,"","");
            timing.stop();
            System.out.println(timing.toString());

            String patientsOutputString  = "";
            for(ThriftPatientPersonalData patient: patients) {
                patientsOutputString += patient.toString() + "\n";
            }

            System.out.println(patientsOutputString);
            //--------------------------------end findPatientByName--------------------------------------------------

            // Close transport
            transport2.close();

        } catch (TException x) {
            x.printStackTrace();
        }
    }
}