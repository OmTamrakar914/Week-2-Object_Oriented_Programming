package com.practiceproblems.ridehailingapplication;

public class RideHailingApp8 {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Alice", 15.0);
        Vehicle bike = new Bike("B001", "Bob", 10.0);
        Vehicle auto = new Auto("A001", "Charlie", 12.0);

        // Using polymorphism to calculate fare dynamically
        calculateAndDisplayFare(car, 10.0);
        calculateAndDisplayFare(bike, 10.0);
        calculateAndDisplayFare(auto, 10.0);

        // Update and display GPS location
        GPS carGPS = (GPS) car;
        carGPS.updateLocation("Downtown");
        System.out.println("Car Current Location: " + carGPS.getCurrentLocation());

        GPS bikeGPS = (GPS) bike;
        bikeGPS.updateLocation("Uptown");
        System.out.println("Bike Current Location: " + bikeGPS.getCurrentLocation());

        GPS autoGPS = (GPS) auto;
        autoGPS.updateLocation("City Center");
        System.out.println("Auto Current Location: " + autoGPS.getCurrentLocation());
    }

    // Method to calculate fare dynamically
    public static void calculateAndDisplayFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        double fare = vehicle.calculateFare(distance);
        System.out.println("Fare for " + distance + " km: $" + fare);
        System.out.println();
    }
}
