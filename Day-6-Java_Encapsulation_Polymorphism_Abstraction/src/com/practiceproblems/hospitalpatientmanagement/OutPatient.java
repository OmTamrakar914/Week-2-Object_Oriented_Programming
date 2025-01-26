package com.practiceproblems.hospitalpatientmanagement;

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String diagnosis;
    private StringBuilder medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee, String diagnosis) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.diagnosis = diagnosis;
        this.medicalHistory = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medical History: ");
        System.out.println(medicalHistory.toString());
    }
}
