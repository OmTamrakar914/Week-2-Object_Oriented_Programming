package com.assitedproblems.animalheirarchy;

//subclass Bird
class Bird extends Animal{

    // Bird class constructor
    Bird(String name, int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Bird make sound - Chirps, Chirps!");
    }
}