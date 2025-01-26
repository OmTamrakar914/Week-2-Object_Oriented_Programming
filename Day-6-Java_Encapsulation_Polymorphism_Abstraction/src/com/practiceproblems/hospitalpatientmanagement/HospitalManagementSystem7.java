package com.practiceproblems.hospitalpatientmanagement;

// Main class to test the implementation
public class HospitalManagementSystem7 {
    public static void main(String[] args) {
        // Create an InPatient instance
        InPatient inPatient = new InPatient("P001", "Alice", 30, 500.0, 5, "Pneumonia");
        inPatient.addRecord("Admitted with severe symptoms.");
        inPatient.addRecord("Prescribed antibiotics.");

        // Create an OutPatient instance
        OutPatient outPatient = new OutPatient("P002", "Bob", 40, 200.0, "Migraine");
        outPatient.addRecord("Routine checkup completed.");
        outPatient.addRecord("Medication prescribed for headaches.");

        // Display details and calculate bill dynamically
        System.out.println("--- InPatient Details ---");
        inPatient.getPatientDetails();
        inPatient.viewRecords();
        System.out.println("Total Bill: $" + inPatient.calculateBill());

        System.out.println("\n--- OutPatient Details ---");
        outPatient.getPatientDetails();
        outPatient.viewRecords();
        System.out.println("Total Bill: $" + outPatient.calculateBill());
    }
}
