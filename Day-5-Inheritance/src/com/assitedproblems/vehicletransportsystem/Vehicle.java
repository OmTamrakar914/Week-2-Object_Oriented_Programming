package com.assitedproblems.vehicletransportsystem;

//class Vehicle
class Vehicle{

    //attributes

    protected double maxSpeed;
    protected String fuelType;

    //constructor
    Vehicle(double maxSpeed, String fuelType){

        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //method for displaying the details of vehicle

    public void displayInfo(){
        System.out.println("-----------Vehicle Details---------------" );
        System.out.println("The Maxspeed of the vehicle : "+maxSpeed);
        System.out.println("The FuelType of the vehicle : "+fuelType);
        System.out.println("------------------------------------------");


    }
}