// creating a class with this , static , and final keywords for Shopping Cart system

import java.util.Scanner;
public class  ShoppingCartSystem4{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		// created two objects with deferent arguments
		Product obj1 = new Product("Bluetooth_Speaker",1999.0,2);
		Product obj2 = new Product("Home_Theater",2999.0,1);
		Product.display(obj1);
		Product.display(obj2);
		
		System.out.println("Enter new discount percentage : ");
		int newDiscount = sc.nextInt();
		Product.updateDiscount(newDiscount);
		
		// dispaly after updating the discount
		Product.display(obj1);
		Product.display(obj2);
		
	}
}
// created a class Product with attribute such as productName, price, quantity
public class Product{
	static int discount = 10;
	String productName;
	double price;
	int quantity;
	final String productID;
	
	//constructor
    Product(String productName, double price, int quantity ){
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.productID = productName + Double.toString(10.0+price);
    } 	
	
	// method to update discount
	public static void updateDiscount(int discount){
		System.out.println("The updated discount percentage is : ");
		Product.discount = discount;
	}
	// method to display the detail of product
	public static void display(Product product){
	  if(product instanceof Product){
	  System.out.println("/n-----------------Product Details-------------------" );
	  System.out.println("The Product Name is              : "+product.productName);
	  System.out.println("The Product ID is                : "+product.productID);
	  System.out.println("The Product Price  is            : "+product.price);
	  System.out.println("The Discount on the product is   : "+product.discount);
	  System.out.println("The Quantity of the product is   : "+product.quantity);
	  System.out.println("--------------------------------------------------" );
	  }else{
		  System.out.println("object is not an instance of class Product");
	  }
	}
}