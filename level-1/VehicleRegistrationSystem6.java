// creating a class with this , static , and final keywords for Vehicle Registration System

public class VehicleRegistrationSystem6{
	public static void main(String []args){
		
		Vehicle obj1 = new Vehicle("Anush Tenguriya","bus",10002);
		Vehicle obj2 = new Vehicle("Om Tamrakar","Car",10003);
		
		
		Vehicle.display(obj1);
	    Vehicle.display(obj2);
		
		Vehicle.updateRegistrationFee(2500);
		
		Vehicle.display(obj1);
	    Vehicle.display(obj2);
		
	}
}
public class Vehicle{
	
	String ownerName;
	String vehicleType;
	final int registrationNumber ;
	static int registrationFee = 1000 ;

	

	
    Vehicle(String ownerName, String vehicleType, int registrationNumber ){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
		
    } 	
	
	public static int updateRegistrationFee(int fees){
		 System.out.println("The Registraition Fees updated");
		return Vehicle.registrationFee = fees;
	}
	
	public static void display(Vehicle object){
	  if(object instanceof Vehicle){
	  System.out.println("\n-----------------Vehicle Details-------------------" );
	  System.out.println("The Vehicle Owner Name is              : "+object.ownerName);
	  System.out.println("The Vehicle Type is                    : "+object.vehicleType);
	  System.out.println("The Vehicle Registration number is     : "+object.registrationNumber);
	  System.out.println("The Vehicle Registration Fees is       : "+object.registrationFee);
	  System.out.println("--------------------------------------------------" );
	  }else{
		  System.out.println("account is not an instance of class BankAccount");
	  }
	}
}