package com.assitedproblems.animalheirarchy;

// inheritance


public class AnimalHierarchy1{
    public static void main(String []args){

        Animal animal = new Animal("Asiatic Lion",20);
        System.out.println("Animal name : "+animal.getName());
        System.out.println("Animal age  : "+animal.getAge());
        animal.makeSound();

        Dog dog = new Dog("Leo",5);
        System.out.println("Dog name : "+dog.getName());
        System.out.println("Dog age  : "+dog.getAge());
        dog.makeSound();
        dog.setAge(8);
        System.out.println("The new Age of Leo :");
        dog.getAge();

        Cat cat = new Cat("mini",4);
        System.out.println("Cat name : "+cat.getName());
        System.out.println("Cat age  : "+cat.getAge());
        cat.makeSound();

        Bird bird = new Bird("kuku",2);
        System.out.println("Bird name : "+bird.getName());
        System.out.println("Bird age  : "+bird.getAge());
        bird.makeSound();
    }
}
