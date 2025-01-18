// creating class to handle mobile phone details

import java.util.Scanner;
public class HandleMobilePhone5{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the MobilePhone Brand Name : ");
		String brand = sc.next();
		System.out.println("Enter the MobilePhone Model Name: ");
		String model = sc.next();
		System.out.println("Enter the MobilePhone price : ");
	    double price = sc.nextDouble();
		
		MobilePhone obj = new MobilePhone(brand,model,price);
		obj.display();
		
		sc.close();
	}
}

// creating the mobile phone class
public class MobilePhone{
	String brand;
	String model;
	double price;
	
	//constructor
	MobilePhone(String brand,String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	//method for displaying mobile details
	public void display(){
		System.out.println("-------The MobilePhone details-------");
		System.out.println("The Brand Name is - "+brand );
		System.out.println("The Model Name is - "+model);
		System.out.println("The Price is      - "+price);
		System.out.println("--------------------------------------");
		
	}
}