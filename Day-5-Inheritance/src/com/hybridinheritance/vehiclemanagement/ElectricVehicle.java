package com.hybridinheritance.vehiclemanagement;

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is charging at a charging station.");
    }
}
