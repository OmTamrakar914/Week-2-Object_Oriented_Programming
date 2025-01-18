// Shopping cart class

import java.util.Scanner;
public class ShoppingCart5{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter itemName : ");
		String itemName = sc.next();
		System.out.println("Enter the price : ");
	    double price = sc.nextDouble();
		System.out.println("Enter the quantity : ");
		int quantity = sc.nextInt();
		
		
		CartItem obj = new CartItem();
		obj.addCartItem(itemName,price, quantity);
		obj.display();
		obj.deleteCartItem();
		obj.display();
		
		sc.close();
	}
}

// creating the mobile phone class
public class CartItem{
	String itemName;
	double price;
	int quantity;
	
	//
	public void addCartItem(String itemName, double price ,int quantity ){
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void deleteCartItem(){
		this.itemName = null;
		this.price = 0.0;
		this.quantity = 0;
	}
	
	
	
	public void display(){
      System.out.println("------Your Cart details are-------");
	  System.out.println("itemName -- "+itemName);
	  System.out.println("price      -- "+price);
	   System.out.println("quantity      -- "+quantity);
	  
	  System.out.println("------------------------------------");
	    
	}
	
	
}