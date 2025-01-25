package com.practiceproblems.employeemanagementsystem;

 abstract class Employee {
     private final int employeeId;
     private String name;
     private double salary;

     //constructor
     Employee(int employeeId, String name, double salary){
         this.employeeId = employeeId;
         this.name = name;
         this.salary = salary;
     }
     //Abstract Method calculateSalary()
     abstract void calculateSalary();

     //Concrete Method
     public void displayDetails(){
         System.out.println("-----------Employee Details----------");
         System.out.println(" Employee ID     : "+employeeId);
         System.out.println(" Employee Name   : "+name);
         System.out.println(" Employee Salary :"+salary);

        }
     //setter method
     public void setSalary(double salary) {
         this.salary = salary;
     }
     //getter method

     public double getSalary() {
         return salary;
     }

     public String getName() {
         return name;
     }
 }
