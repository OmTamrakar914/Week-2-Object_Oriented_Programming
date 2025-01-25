package com.practiceproblems.employeemanagementsystem;

public class FullTImeEmployee extends Employee {
    protected double newSalary;
    private String department;
    private String name;
    //Constructor
    FullTImeEmployee(int employeeId, String name, double salary,String department){
        super(employeeId,name,salary);
        this.department = department;
    }

    //implementing the calculateSalary method by getter and setter methods
    void calculateSalary(){
         newSalary = getSalary();
         setSalary(newSalary);
         System.out.println("The New Salary of the Full TIme Employee is "+newSalary);
    }

    //getDepartment method
    public String getDepartment(){
        return department;
    }

    //implementing the assignDepartment method

    public void assignDepartment(String department){
        this.department = department;
    }

    //implementing the displayDepartment method

    public void getDepartmentDetails() {
     System.out.println("The Employee "+getName()+" work in "+getDepartment()+" Department");
    }
}
