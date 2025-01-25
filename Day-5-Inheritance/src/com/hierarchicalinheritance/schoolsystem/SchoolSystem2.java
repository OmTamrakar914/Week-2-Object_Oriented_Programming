package com.hierarchicalinheritance.schoolsystem;

public class SchoolSystem2 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Ojas Johar", 21, "Java");
        teacher.displayRole();

        Student student=new Student("Anush Tenguriya", 20, "A");
        student.displayRole();

        Staff staff=new Staff("Om Tamrakar", 20, 100000);
        staff.displayRole();

    }
}
