import java.util.Scanner;
// Created class for book borrow system
class Book{
	private String title;
	private String author;
	private double price;
	private boolean availabilty;
	
	Book(){
		this.title="Learn java";
		this.author="Harshit";
		this.price=100;
		this.availabilty=true;
	}
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void boorowBook(){
		this.availabilty=!availabilty;
	}
	
	public void displayDetails(){
		System.out.println("-----Book Details-----");
		System.out.println("Title       : " + title);
		System.out.println("Author      : " + author);
		System.out.println("Price       : $" + price);
		System.out.println("availabilty : " + availabilty);
		System.out.println("----------------------");
	}
}

public class BookBorrow5{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
			
        //taking input
		System.out.println("Enter the title of book:");
		String title=scanner.nextLine(); 

		//taking input
		System.out.println("Enter the name of author of book:");
		String author=scanner.nextLine();	

		//taking input
		System.out.println("Enter the price of book:");
		double price=scanner.nextDouble();	

        //creating class object with parameterized constructor
		System.out.println("\nAfter implementing borrow method.");
        Book book1 = new Book(title,author,price);
        book1.displayDetails(); 	

        System.out.println("\nAfter implementing borrow method.");	
		book1.boorowBook();
		book1.displayDetails();

		scanner.close();
	}
}
