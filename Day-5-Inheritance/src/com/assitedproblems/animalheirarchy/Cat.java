package com.assitedproblems.animalheirarchy;

//subclass Cat
class Cat extends Animal{

    //Cat class constructor
    Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("Cat make sound - Meao Meao!");
    }
}