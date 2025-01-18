// Creating a Employee class with attributes name, id, salary and display it by using method

 class Employee{
	//creating the attribute variables
	String name;
	int id;
	double salary;
	
	//Constructor
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id ;
		this.salary = salary;
	}
	
	//Method to display details
	public void display(){
		System.out.println("-------Employee details--------");
		System.out.println("Name   : "+name);
		System.out.println("Id     : "+id);
		System.out.println("Salary : "+ salary);
		System.out.println("-------------------------------");
		
	}
	
	
}
public class EmployeeDetail1{
	public static void main(String[] args){
		Employee obj = new Employee("Ramesh", 245218, 800000);
		obj.display();
	}
}