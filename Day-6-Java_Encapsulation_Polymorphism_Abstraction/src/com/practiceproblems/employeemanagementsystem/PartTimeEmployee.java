package com.practiceproblems.employeemanagementsystem;

public class PartTimeEmployee extends Employee {
    protected double newPartSalary;
    private String department;
    //Constructor
    PartTimeEmployee(int employeeID, String name, double salary, String department){
        super(employeeID, name, salary);
        this.department = department;
    }

    //implementing the calculateSalary method

    @Override
    void calculateSalary() {
        newPartSalary = getSalary();
        setSalary(newPartSalary);
    }

    //getDepartment method
    public String getDepartment() {
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
