package com.practiceproblems.vehiclerentalsystem;

// Car subclass
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance cost for cars
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: Confidential";
    }
}

