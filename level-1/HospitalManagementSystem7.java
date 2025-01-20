// creating a class with this , static , and final keywords for Hospital Management System


public class HospitalManagementSystem7{
	public static void main(String []args){
		// created two objects with deferent arguments
		 Patient obj1 = new  Patient("Conrad Hawkins",32,"heart disease");
		 Patient obj2 = new  Patient("devon pravesh",30,"bone disease");
		
		//calling the display method
		 Patient.display(obj1);
	     Patient.display(obj2);
		 
		 //displaying the total patient in hospital
		int total = Patient.getTotalPatients();
		System.out.println("The Total patient in the hospital is : "+total);
	}
}
//created a class Patient with name , age, ailment, patientID
public class  Patient{
	static String hospitalName  = "Chashtain Memorial Park";       //static data member
	String name;
	int age ;
	String ailment ;
	final int patientID;           //final data member
	static int totalPatient;          //static data member
	

	
 
          // constructor	
     Patient(String name, int age, String ailment ){
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		this.totalPatient++;
		this.patientID = 10010+totalPatient;
    } 	
	//totalPatient method
	public static int getTotalPatients(){
		 
		return Patient.totalPatient;
	}
	//display method for patient details
	public static void display( Patient object){
	  if(object instanceof  Patient){
	  System.out.println("\n----------------- Patient Details-------------------" );
	  System.out.println("The Patient Name is        : "+object.name);
	  System.out.println("The Patient ID is          : "+object.patientID);
	  System.out.println("The Patient Age is         : "+object.age);
	  System.out.println("The Patient ailment is     : "+object.ailment);
	  System.out.println("--------------------------------------------------" );
	  }else{
		  System.out.println("object is not an instance of class BankAccount");
	  }
	}
}