package com.singleinheritance.smarthomedevice;

// Smart Home Devices

public class SmartHomeDevice2{
    public static void main(String[]args){
        // Device class object
        Device device = new Device(1233, "Refurbished");

        device.displayStatus();


        // Thermostat class object
        Thermostat thermostat = new Thermostat(1353, "new", "normal");

        thermostat.displayStatus();

        thermostat.setStatus("New");
        System.out.println("The new Status of the device : "+thermostat.getStatus());
        thermostat.displayStatus();
    }
}