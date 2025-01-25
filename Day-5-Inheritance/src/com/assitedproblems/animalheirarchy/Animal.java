package com.assitedproblems.animalheirarchy;

//class animal
class Animal{
    // attributes
    protected String name;
    protected int age;

    //constructor
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //method makesound()
    public void makeSound(){
        System.out.println("Animal makes sound!");
    }

    //set method for name
    public void setName(String name){
        this.name = name;
    }

    //set method for age
    public void setAge(int age){
        this.age = age;
    }

    //get method for name
    public String getName(){
        return name;
    }
    //get method for age
    public int getAge(){
        return age;
    }

}
