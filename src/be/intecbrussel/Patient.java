package be.intecbrussel;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;

public class Patient {//implements Comparator<Patient>
    private String nationalRegistryNumber;
    private String fullName;
    private int age;
    private int temperature;
    private boolean unknownVirus;
    private boolean insurance;

    public Patient() {
    }

    public Patient(String nationalRegistryNumber, String fullName, int age, int temperature, boolean unknownVirus, boolean ensured) {
        this.nationalRegistryNumber = nationalRegistryNumber;
        this.fullName = fullName;
        this.age = age;
        this.temperature = temperature;
        this.unknownVirus = unknownVirus;
        this.insurance = ensured;
    }


    public String getNationalRegistryNumber() {

        return nationalRegistryNumber;
    }

    public void setNationalRegistryNumber(String nationalRegistryNumber) {

        this.nationalRegistryNumber = nationalRegistryNumber;
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getTemperature() {

        return temperature;
    }

    public void setTemperature(int temperature) {

        this.temperature = temperature;
    }

    public boolean isUnknownVirus() {

        return unknownVirus;
    }

    public void setUnknownVirus(boolean unknownVirus) {

        this.unknownVirus = unknownVirus;
    }

    public boolean isInsurance() {

        return insurance;
    }

    public void setInsurance(boolean ensured) {

        this.insurance = ensured;
    }

    public static List<Patient> getAllPatients() {
        List<Patient> allPatients = new ArrayList<>();
        allPatients.add(new Patient("110201321", "Donald Putin", 90, 39, false, true));
        allPatients.add(new Patient("030201321", "Lucky Luke", 69, 38, true, false));
        allPatients.add(new Patient("030201322", "Stromae Papaoutai", 35, 40, false, true));
        allPatients.add(new Patient("030801321", "GringoireLune", 80, 36, true, true));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030244321", "Sanic the HedgeHog", 16, 37, true, true));
        allPatients.add(new Patient("110201321", "Donald Putin", 90, 39, false, true));
        allPatients.add(new Patient("110201321", "Donald Putin", 90, 39, false, true));
        allPatients.add(new Patient("088201321", "Bilbo Baggins", 23, 39, true, false));
        allPatients.add(new Patient("035501321", "Lucio Correa Dos Santos", 40, 38, false, true));
        allPatients.add(new Patient("030206621", "Doctor Who", 33, 35, true, true));
        allPatients.add(new Patient("030245321", "Luke Cage", 46, 41, true, false));
        allPatients.add(new Patient("030298321", "Naruto Uzumaki", 13, 38, false, false));
        allPatients.add(new Patient("125201321", "Billy Batson", 15, 40, true, false));
        allPatients.add(new Patient("987201321", "Joseph Joestar", 75, 36, true, false));
        allPatients.add(new Patient("645201321", "Jon Snow", 33, 35, false, false));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("582201321", "Alexander Hamilton", 65, 38, false, false));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030201231", "Zelda of Hyrule", 17, 38, false, true));
        allPatients.add(new Patient("830208651", "Mother Theresa", 98, 39, true, false));
        allPatients.add(new Patient("030209741", "Willy Wonka", 70, 40, true, true));
        allPatients.add(new Patient("030205411", "Scrooge McDuck", 73, 38, true, false));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("030209861", "Sonia Magnlia", 35, 39, false, false));
        allPatients.add(new Patient("030278921", "Peter Parker", 21, 40, true, false));
        allPatients.add(new Patient("030269821", "Bruce Wayne", 46, 35, false, true));
        allPatients.add(new Patient("030215421", "Seto Kaiba", 22, 38, false, true));
        allPatients.add(new Patient("030296321", "Mario Mario", 50, 37, false, false));
        allPatients.add(new Patient("035051321", "Harry Potter", 18, 39, true, true));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("036781321", "Mary Poppins", 38, 38, true, false));
        allPatients.add(new Patient("033691321", "Alexander the Great", 51, 37, false, true));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030201000", "Huey Freeman", 12, 40, false, false));
        allPatients.add(new Patient("000201321", "Miku Hatsune", 16, 36, true, true));
        allPatients.add(new Patient("111201321", "Drake Josh", 33, 38, true, false));
        allPatients.add(new Patient("222201321", "April O'Neil", 29, 37, false, false));
        allPatients.add(new Patient("102225433","Jenny Von Ze Block",61,40,true,true));
        return allPatients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient patient)) return false;
        return Objects.equals(nationalRegistryNumber, patient.nationalRegistryNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nationalRegistryNumber, fullName, age, temperature, unknownVirus, insurance);
    }

    @Override
    public String toString() {
        return "Patient: " +
                "nationalRegistryNumber='" + nationalRegistryNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", temperature=" + temperature +
                ", unknownVirus=" + unknownVirus +
                ", ensured=" + insurance +
                "\n";
    }

    public static int compare(Patient p1, Patient p2) {
        int tempCompare = Double.compare(p2.getTemperature(), p1.getTemperature());
        if (tempCompare != 0) {
            return tempCompare;
        }
        return Integer.compare(p2.getAge(), p1.getAge());
    }

    public static Collection<Patient> oef2() {
        List<Patient> patients = getAllPatients();
        patients.sort(Patient::compare);
        return patients;
    }

    public static Collection<Patient> oef2b() {
        List<Patient> listPatients = new ArrayList<>(oef2());

        listPatients
                .sort(Comparator.comparing(Patient::isInsurance)
                .thenComparing((Patient p3) -> p3.getTemperature() >= 38 ? 1 : -1)
                .thenComparing(Patient::getAge)
                .reversed());

        return new LinkedBlockingQueue<>(listPatients);
    }

    public static Map<Integer, List<Patient>> oef3() {
        Queue<Patient> listPatients3 = new LinkedBlockingQueue<>(oef2());
        Map<Integer, List<Patient>> result = new HashMap<>();
        int mapper = 0;

        while (true) {
            Patient patient = listPatients3.peek();
            if (patient == null) {
                break;
            }
            if (((patient.getAge() <= 65 && patient.getTemperature() >= 38) || (patient.getTemperature() >= 40 && patient.isUnknownVirus()))) {
                mapper = 1;
            } else if (patient.getTemperature() >= 38 && patient.isUnknownVirus()) {
                mapper = 2;
            } else if (patient.isUnknownVirus()) {
                mapper = 3;
            } else if (patient.getTemperature() >= 38) {
                mapper = 4;
            } else {
                listPatients3.remove();
                continue;
            }

            result.putIfAbsent(mapper, new ArrayList<>());
            result.get(mapper).add(listPatients3.remove());
        }

        System.out.println("startingQueue: " + listPatients3);
        return result;

    }

}

