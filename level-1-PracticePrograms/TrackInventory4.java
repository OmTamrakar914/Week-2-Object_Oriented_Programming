// Create a item class to track inventory
import java.util.Scanner;
public class TrackInventory4{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ItemCode : ");
		String itemCode = sc.next();
		System.out.println("Enter the itemName : ");
		String itemName = sc.next();
		System.out.println("Enter the price : ");
	    double price = sc.nextDouble();
		
		Item obj = new Item(itemCode,itemName, price );
		
		obj.display();
		
		System.out.println("Enter the no. of item");
		int noItem = sc.nextInt();
		
		double ans = obj.totalCost(noItem);
		System.out.println("The Total cost of the item is : "+ans);
	}
}

public class Item{
	String itemCode;
	String itemName;
	Double price;
	
	//constructor
	Item(String itemCode,String itemName,Double price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	//method to calculate the total cost of given quantity
	public double totalCost(double number){
		double cost = number * price;
		return cost;
	}
	// method to display the item details
	public void display(){
		System.out.println("-------The Item details-------");
		System.out.println("The ItemCode is - "+itemCode );
		System.out.println("The ItemName is - "+itemName);
		System.out.println("The Price is    - "+price);
		System.out.println("------------------------------");
		
	}
	
}