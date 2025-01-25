package com.assitedproblems.employeemanagementsystem;

//class Employee
class Employee{

    //Attributes
    protected String name;
    final protected int id;
    protected double salary;

    //Constructor
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //get method for name
    public String getName(){
        return name;
    }

    //get method for salary
    public double getSalary(){
        return salary;
    }

    //method display details
    public void displayDetails(){
        System.out.println("--------Employee Details-------");
        System.out.println("The Employee name   : "+name);
        System.out.println("The Employee id     : "+id);
        System.out.println("The Employee salary : "+salary);
        System.out.println("-------------------------------");
    }

}