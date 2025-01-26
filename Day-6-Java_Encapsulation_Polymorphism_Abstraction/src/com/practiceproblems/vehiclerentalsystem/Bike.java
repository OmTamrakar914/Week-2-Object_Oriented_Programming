package com.practiceproblems.vehiclerentalsystem;

// Bike subclass
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return 200; // fixed insurance cost for bikes
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: Confidential";
    }
}


