
import java.util.Scanner;

public class UniversityManagementSystem1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rollnumber of student");
		int rollnumber = sc.nextInt();
		
		System.out.println("Enter the name of student");
		String name = sc.nextLine();
		
		System.out.println("Enter the cgpa of student");
		double cgpa = sc.nextDouble();
		
		Student st = new Student(rollnumber, name, cgpa);
		
		System.out.println("Enter the New cgpa of student");
		double newcgpa = sc.nextDouble();
		
	    double ans = st.modifyCgpa(newcgpa);
		System.out.println("the new cgpa of the student is : "+ans);
		
		System.out.println("Enter the name of new student");
		String newName = sc.nextLine();
		
		PostgraduateStudent obj = new PostgraduateStudent();
		
		String newStudentName = obj.studentName(newName);
		System.out.println("the name of new student is : "+newStudentName);
		
	    } 
    }


//creating student class
	class Student {
		public int rollnumber; // public data member
		protected String name;  // protected data member
		private double cgpa;   // private data member
		
		//default constructor
		Student(){
			this.rollnumber = 0;
			this.name = "";
			this.cgpa = 0.0 ;
		}
		
		//constructor
		Student(int rollnumber, String name, double cgpa){
			this.rollnumber = rollnumber;
			this.name = name;
			this.cgpa = cgpa;
		}
		
		//method to access the cgpa and modify it
		public double modifyCgpa(double newCgpa){
			this.cgpa = newCgpa;
			return cgpa;
		}
		
	}
	
	class PostgraduateStudent extends Student{
			
		//method to access the protected members of the Student class
		public String studentName(String newName){
			name = newName;
			return name;
         	}
    }
	
