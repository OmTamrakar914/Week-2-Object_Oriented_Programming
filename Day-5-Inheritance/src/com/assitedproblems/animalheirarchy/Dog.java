package com.assitedproblems.animalheirarchy;


//subclass Dog
class Dog extends Animal{

    // Dog class constructor
    Dog(String name, int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Dog makes sound - Barks!");
    }
}
