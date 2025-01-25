package com.hybridinheritance.restaurantmanagementsystem;

// Subclass Waiter
class Waiter extends Person implements Worker {

    // Constructor
    Waiter(String name, int id) {
        super(name, id);
    }

    // Overriding the performDuties method
    @Override
    public void performDuties() {
        System.out.println("The Waiter serves food and speaks very well!");
    }
}
