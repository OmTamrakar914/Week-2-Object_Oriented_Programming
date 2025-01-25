package com.hybridinheritance.restaurantmanagementsystem;

// Base class Person
class Person {

    // Attributes
    public String name;
    public int id;

    // Constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display the details
    public void displayDetails() {
        System.out.println("The Name of the Person : " + name);
        System.out.println("The ID of the Person   : " + id);
    }
}