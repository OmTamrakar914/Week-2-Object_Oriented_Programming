package com.hybridinheritance.restaurantmanagementsystem;

// Subclass Chef
class Chef extends Person implements Worker {

    // Constructor
    Chef(String name, int id) {
        super(name, id);
    }

    // Implementing the performDuties method
    @Override
    public void performDuties() {
        System.out.println("The Chef cooks very delicious food.");
    }
}