package com.assitedproblems.employeemanagementsystem;

// class Intern

class Intern extends Employee {

    //attributes
    protected int internshipDuration;

    //constructor
    Intern(String name,int id, double salary, int internshipDuration){
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    //method for display the details of Intern
    @Override
    public void displayDetails(){
        System.out.println("------------Employee Details--------------");
        System.out.println("The Employee name             : "+name);
        System.out.println("The Employee id               : "+id);
        System.out.println("The Employee salary           : "+salary);
        System.out.println("Internship Duration in months : "+internshipDuration);
        System.out.println("------------------------------------------");

    }
    //set method to set the duration
    public void setDuration(int duration){
        this.internshipDuration = duration;
    }

    //method to get the new duration
    public int getDuration(){
        return internshipDuration;
    }
}
