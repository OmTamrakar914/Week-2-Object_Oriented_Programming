package com.assitedproblems.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[]args){
        Employee employee = new Employee("Anush Tenguriya", 202025,70000.00);
        employee.displayDetails();

        Manager manager = new Manager("Om Tamrakar",222026,80000.00,10);
        manager.displayDetails();
        manager.setTeamSize(15);
        System.out.println("The New Teamsize is :"+manager.getTeamSize());
        manager.displayDetails();

        Developer developer = new Developer("Ojas johar", 212027,50000.00,"JAVA");
        developer.displayDetails();

        Intern intern = new Intern("Sejal Chauhan", 232023, 30000.00,2);
        intern.displayDetails();


    }
}
