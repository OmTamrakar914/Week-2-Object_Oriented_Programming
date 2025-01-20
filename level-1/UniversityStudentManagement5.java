// creating a class with this , static , and final keywords for University Student Management

public class UniversityStudentManagement5{
	public static void main(String []args){
		
		Student obj1 = new Student("Anush Tenguriya",1340142,'A');
		Student obj2 = new Student("Om Tamrakar",10340135,'B');
		
		
		Student.display(obj1);
	    Student.display(obj2);
		
		System.out.println("The Total number of Student in the company is : "+Student.displayTotalStudents());
	}
}
public class Student{
	static String UniversityName = "Technocrats Institute of Technology";
	String name;
	final int rollnumber;
	char grade;
	static int totalStudent;
	

	
    Student(String name, int rollnumber, char grade ){
		this.name = name;
		this.rollnumber = rollnumber;
		this.grade = grade;
		this.totalStudent++;
    } 	
	
	public static int displayTotalStudents(){
		return Student.totalStudent;
	}
	
	public static void display(Student object){
	  if(object instanceof Student){
	  System.out.println("\n-----------------Student Details-------------------" );
	  System.out.println("The Student Name is              : "+object.name);
      System.out.println("The University Name is              : "+object.UniversityName);
	  System.out.println("The Student rollnumber is        : "+object.rollnumber);
	  System.out.println("The Student grade is             : "+object.grade);
	  System.out.println("--------------------------------------------------" );
	  }else{
		  System.out.println("account is not an instance of class BankAccount");
	  }
	}
}