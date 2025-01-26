package com.practiceproblems.vehiclerentalsystem;

// Truck subclass
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // 20% extra charge for trucks
    }

    @Override
    public double calculateInsurance() {
        return 1000; // fixed insurance cost for trucks
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: Confidential";
    }
}

