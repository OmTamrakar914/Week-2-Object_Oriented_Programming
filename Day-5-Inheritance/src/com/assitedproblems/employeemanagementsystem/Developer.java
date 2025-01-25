package com.assitedproblems.employeemanagementsystem;

//class Developer


class Developer extends Employee {

    //attributes
    protected String programmingLanguage;

    //constructor
    Developer(String name,int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    //method for display the details of Developer
    @Override
    public void displayDetails(){
        System.out.println("--------Employee Details-------------");
        System.out.println("The Employee name        : "+name);
        System.out.println("The Employee id          : "+id);
        System.out.println("The Employee salary      : "+salary);
        System.out.println("The Programming Language : "+programmingLanguage);
        System.out.println("-------------------------------------");

    }

    //set method to set the programmingLanguage
    public void setProgrammingLanguage(String Language){
        this.programmingLanguage = programmingLanguage;
    }

    //method to get the setProgrammingLanguage
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
}