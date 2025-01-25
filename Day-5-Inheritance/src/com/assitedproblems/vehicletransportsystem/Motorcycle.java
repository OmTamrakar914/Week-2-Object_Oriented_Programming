package com.assitedproblems.vehicletransportsystem;

//class Motorcycle
class Motorcycle extends Vehicle{

    //attributes
    protected String name;
    protected int enginePower;

    //constructor
    Motorcycle(String name, double maxSpeed, String fuelType, int enginePower){
        super(maxSpeed,fuelType);
        this.name = name;
        this.enginePower = enginePower;
    }

    //method for displaying the details of vehicle
    @Override
    public void displayInfo(){
        System.out.println("-------------Motorcycle Details-------------------------" );
        System.out.println("The Name of the Motorcycle           : "+name);
        System.out.println("The Maxspeed of the Truck            : "+maxSpeed);
        System.out.println("The FuelType of the Truck            : "+fuelType);
        System.out.println("The Engine Power of the vehicle      : "+enginePower+"cc");
        System.out.println("--------------------------------------------------");
    }

}
