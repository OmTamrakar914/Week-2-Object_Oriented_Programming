package com.hybridinheritance.restaurantmanagementsystem;

public class RestaurantManagementSystem {
    public static void main(String[] args) {

        // Creating a Person object
        Person person = new Person("Manager", 123654);
        person.displayDetails();

        // Creating a Chef object
        Chef chef = new Chef("Devon", 234765);
        chef.displayDetails();
        chef.performDuties();

        // Creating a Waiter object
        Waiter waiter = new Waiter("Conrad", 200765);
        waiter.displayDetails();
        waiter.performDuties();
    }
}