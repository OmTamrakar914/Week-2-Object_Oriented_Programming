package com.assitedproblems.vehicletransportsystem;

//class Truck
class Truck extends Vehicle{

    //attributes
    protected String name;
    protected int noOfWheels;

    //constructor
    Truck(String name,double maxSpeed, String fuelType, int noOfWheels){
        super(maxSpeed,fuelType);
        this.name=name;
        this.noOfWheels = noOfWheels;
    }

    //method for displaying the details of vehicle
    @Override
    public void displayInfo(){
        System.out.println("-------------Truck Details------------------------" );
        System.out.println("The Name of the Truck                : "+name);
        System.out.println("The Maxspeed of the Truck            : "+maxSpeed);
        System.out.println("The FuelType of the Truck            : "+fuelType);
        System.out.println("The Number of Wheels of the vehicle  : "+noOfWheels);
        System.out.println("-------------------------------------------------");
    }

}

