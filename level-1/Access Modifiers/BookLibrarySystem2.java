

import java.util.Scanner;

public class BookLibrarySystem2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ISBN of Book");
		int isbn = sc.nextInt();
		//sc.next();
		
		System.out.println("Enter the title of Book");
		String title = sc.next();
		
		System.out.println("Enter the author of Book");
		String author = sc.next();
		
		Book book = new Book();
		
		System.out.println("Enter the New author name : ");
		String newAuthor = sc.next();
		
		//Setting the author name by calling set method
		 book.set(newAuthor);
		 //calling the getting the function
	    String ans = book.get();
		System.out.println("the New author name is : "+ans);
		
		Ebook object = new Ebook();
		
		System.out.println("Enter the new ISBN of Book");
		int newIsbn = sc.nextInt();
		
		int ans2 = object.accessIsbn(newIsbn);
		System.out.println("The new ISBN of Book : "+ans2);
		
		
		System.out.println("Enter the new title of Book");
		String titleNew = sc.next();
		
		String updateTitle = object.accessTitle(titleNew);
		System.out.println("the new title of Book is  : "+updateTitle);
		
	
		
	    } 
    }


//creating Book class
	class Book {
		public int isbn; // public data member
		protected String title;  // protected data member
		private String author;   // private data member
		
		//default constructor
		Book(){
			this.isbn = 0;
			this.title = "";
			this.author = "" ;
		}
		 
		 public void set(String author){
			this.author = author ;
		 }
		
		public String get(){
			return author;
		}
	}
	
	class Ebook extends Book{
		//method to access the public members of the Book class
		public int accessIsbn(int isbn){
			this.isbn = isbn;
			return isbn;
		}
		//method to access the protected member
		public String accessTitle(String title){
			this.title = title;
			return title;
		}
	}
	
	
	
