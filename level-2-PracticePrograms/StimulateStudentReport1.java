// created a student class to create a student report

import java.util.Scanner;
public class StimulateStudentReport1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of Student : ");
		String name = sc.next();
		System.out.println("Enter the Rollnumber of the student: ");
		String rollnumber = sc.next();
		System.out.println("Enter the Student marks : ");
	    double marks = sc.nextDouble();
		
		Student obj = new Student(name,rollnumber,marks);
		obj.display();
		
		sc.close();
	}
}

// creating the Student class
public class Student{
	String name;
	String rollnumber;
	double marks;
	
	//constructor
	Student(String name, String rollnumber, double marks){
		this.name = name;
		this.rollnumber = rollnumber;
		this.marks = marks;
	}
	
	//method for grade
	public char grades(){
		
		if(marks >= 80){
			return'A';
		}
		if(marks < 80 && marks >=60){
			return'B';
		}
		if(marks <60 && marks >=40 ){
			return'C';
		}
		if(marks < 40 && marks >=20){
			return'D';
		}else{
			return'E';
		}
			
	}
	
	
	//method for displaying mobile details
	public void display(){
		
		char grade = grades();
		
		System.out.println("------Student Report Card-------");
		System.out.println(" Student Name    - "+name );
		System.out.println(" Rollnumber      - "+rollnumber);
		System.out.println(" Marks           - "+marks);
		System.out.println(" grade           - "+grade);
		System.out.println("--------------------------------");
	}
}