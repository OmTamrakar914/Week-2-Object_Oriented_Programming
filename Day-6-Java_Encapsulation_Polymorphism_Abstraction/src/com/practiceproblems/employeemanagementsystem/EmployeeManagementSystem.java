package com.practiceproblems.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String []args){
        FullTImeEmployee fullTImeEmployee = new FullTImeEmployee(24045,"Aman",20000.00,"Sales");
        fullTImeEmployee.displayDetails();
        fullTImeEmployee.calculateSalary();
        fullTImeEmployee.getDepartmentDetails();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(12354,"Ram",25000.00, "IT");
        partTimeEmployee.displayDetails();
        partTimeEmployee.calculateSalary();
        partTimeEmployee.getDepartmentDetails();

    }
}
