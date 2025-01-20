// creating a class with this , static , and final keywords for Library Management system

public class LibraryManagementSystem2{
	public static void main(String []args){
		// object of book
		Book obj1 = new Book("Game Of Thrones","RR Martin",0111211035);
		
		//calling the static display method 
		Book.display(obj1);
		
		System.out.println("The LibraryName is : "+Book.displayLibraryName());
	}
}
// created a class book with attribute such as title, author, isbn
public class Book{
	static String libraryName = "Wisdom Library"; //static data member
	String title;
	String author;
	final int isbn;                               //final date member
	
	
	//constructor
    Book(String title, String author, int isbn ){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
    } 	
	//display library name method
	public static String displayLibraryName(){
		return libraryName;
	}
	
	// display method
	public static void display(Book object){
	  if(object instanceof Book){
	  System.out.println("/n-----------------Book Details-------------------" );
	  System.out.println("The Book Title is              : "+object.title);
	  System.out.println("The Author of the book  is     : "+object.author);
	  System.out.println("The ISBN number of the book is : "+object.isbn);
	  System.out.println("--------------------------------------------------" );
	  }else{
		  System.out.println("account is not an instance of class BankAccount");
	  }
	}
}