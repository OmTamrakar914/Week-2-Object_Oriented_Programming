package com.assitedproblems.vehicletransportsystem;

//class Car
class Car extends Vehicle{

    //attributes
    protected String name;
    protected int seatCapacity;

    //constructor
    Car(String name,double maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed,fuelType);
        this.name = name;
        this.seatCapacity = seatCapacity;
    }

    //method for displaying the details of vehicle
    @Override
    public void displayInfo(){
        System.out.println("-----------Car Details------------------------" );
        System.out.println("The Name of the Car         : "+name);
        System.out.println("The Maxspeed of the Car     : "+maxSpeed);
        System.out.println("The FuelType of the Car     : "+fuelType);
        System.out.println("The SeatCapacity of the Car : "+seatCapacity);
        System.out.println("---------------------------------------------");

    }

}

