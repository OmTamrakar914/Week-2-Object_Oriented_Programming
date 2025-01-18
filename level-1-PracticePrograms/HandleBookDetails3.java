// creating class book and attributes title, author, price

import java.util.Scanner;
class Book{
	String title;
	String author;
	String price;
	
	Book(String title, String author,String price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//method to display the book details
	public void display(){
		
		System.out.println("------- The Book Details are ------ ");
		System.out.println("The Title of book  : "+title);
		System.out.println("The Author of book : "+author);
		System.out.println("The Price of book  : "+price);
		System.out.println("------------------------------------");
		
		
	}
}

public class HandleBookDetails3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Title of book : ");
		String title = sc.nextLine();
	    System.out.println("Enter the Author of book : ");
		String author = sc.nextLine();
		System.out.println("Enter the Price of book : ");
		String price = sc.nextLine();
		
		// object created
		Book obj = new Book(title, author, price);
		
		obj.display();
		
	
	}
}
