package com.assitedproblems.employeemanagementsystem;

//class Manager

class Manager extends Employee {

    //attributes
    protected int teamSize;

    //constructor
    Manager(String name,int id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    //method for display the details of manager
    @Override
    public void displayDetails(){
        System.out.println("--------Employee Details-------");
        System.out.println("The Employee name   : "+name);
        System.out.println("The Employee id     : "+id);
        System.out.println("The Employee salary : "+salary);
        System.out.println("The Team Size       : "+teamSize);
        System.out.println("-------------------------------");

    }

    //set method to set the teamSize
    public void setTeamSize(int teamSize){
        this.teamSize = teamSize;
    }

    //method to get the new teamSize
    public int getTeamSize(){
        return teamSize;
    }
}
