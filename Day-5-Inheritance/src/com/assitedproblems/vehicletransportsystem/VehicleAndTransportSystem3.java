package com.assitedproblems.vehicletransportsystem;

// Vehicle Transport System

class VehicleAndTransportSystem3{
    public static void main(String[] args){

        //creating the vehicle array of objects
        Vehicle vehicle[] = new Vehicle[3];

        vehicle[0] = new Car("Lamborghini",380,"petrol",2);
        vehicle[1] = new Truck("Tata Truck",120,"Diesal",8);
        vehicle[2] = new Motorcycle("Kawasaki Ninja",450,"petrol",425);

        //calling the dispaly method
        vehicle[0].displayInfo();
        vehicle[1].displayInfo();
        vehicle[2].displayInfo();

    }
}
