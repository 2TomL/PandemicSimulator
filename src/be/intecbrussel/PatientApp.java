package be.intecbrussel;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PatientApp {
    public static void main(String[] args) {
        //Oef 1
        Collection<Patient> patients1 = new LinkedHashSet<>(Patient.getAllPatients());
        for (Patient patient : patients1) {
            System.out.print(patient);
        }
        System.out.println("\n \n____________________________________________________________________________________________________________________________________________________________________________\n \n");

        //Oef 2
        System.out.println(Patient.oef2());
        System.out.println("\n \n____________________________________________________________________________________________________________________________________________________________________________\n \n");

        //Oef 2b
        System.out.println(Patient.oef2b());
        System.out.println("\n \n____________________________________________________________________________________________________________________________________________________________________________\n \n");

        //Oef 3
//        System.out.println(Patient.oef3());
        Map<Integer, List<Patient>> maps = Patient.oef3();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Patients lvl "+ i+ ": ");
            List<Patient> patientList = maps.getOrDefault(i, Collections.emptyList());
            patientList.sort(Comparator.comparing(Patient::getFullName));
            for (Patient patient : patientList) {
                System.out.println(patient);
            }
            System.out.println("\n \n____________________________________________________________________________________________________________________________________________________________________________\n \n");
        }
    }
}