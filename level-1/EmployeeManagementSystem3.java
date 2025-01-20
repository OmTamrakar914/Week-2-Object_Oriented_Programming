// creating a class with this , static , and final keywords for Employee Management system

public class EmployeeManagementSystem3{
	public static void main(String []args){
		
		// created two objects with deferent arguments
		Employee obj1 = new Employee("Anush Tenguriya","PR100142","SDE-1");
		Employee obj2 = new Employee("Om Tamrakar","PR100135","SDE-2");
		
		//calling the display method
		Employee.display(obj1);
	    Employee.display(obj2);
		
		System.out.println("The Total number of employees in the company is : "+Employee.displayTotalEmployees());
	}
}
//created a class Employee with attribute such as name, id, designation
public class Employee{
	static String CompanyName = "IBM";                  //static data member
	String name;
	final String id;                                     //final data member
	String designation;
	static int totalEmployee;
	

//constructor
    Employee(String name, String id, String designation ){
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.totalEmployee++;
    } 	
	
	//display total employee method
	public static int displayTotalEmployees(){
		return Employee.totalEmployee;
	}
	
	//display employee details
	public static void display(Employee object){
	  if(object instanceof Employee){
	  System.out.println("/n-----------------Employee Details-------------------" );
	  System.out.println("The Employee Name is              : "+object.name);
	  System.out.println("The Company Name is               : "+object.CompanyName);
	  System.out.println("The Employee ID is                : "+object.id);
	  System.out.println("The Employee Designation is       : "+object.designation);
	  System.out.println("--------------------------------------------------" );
	  }else{
		  System.out.println("account is not an instance of class BankAccount");
	  }
	}
}