package com.practiceproblems.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;
// Main class to demonstrate polymorphism
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C123", 1000, "CAR12345"));
        vehicles.add(new Bike("B456", 500, "BIKE6789"));
        vehicles.add(new Truck("T789", 2000, "TRUCK9876"));

        // Calculate rental and insurance costs for each vehicle
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurableVehicle.calculateInsurance());
                System.out.println(insurableVehicle.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}

