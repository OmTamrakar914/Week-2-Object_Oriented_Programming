// craeting class for movie booking

import java.util.Scanner;
public class MovieTicketBooking4{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Movie Name : ");
		String movieName = sc.next();
		System.out.println("Enter the Seat Number : ");
		int seatNumber = sc.nextInt();
		System.out.println("Enter the price : ");
	    double price = sc.nextDouble();
		
		MovieTicket obj = new MovieTicket(movieName,seatNumber, price );
		obj.ticketBook();
		
		sc.close();
	}
}

// creating the mobile phone class
public class MovieTicket{
	String movieName;
	int seatNumber;
	double price;
	
	//constructor
	MovieTicket(String movieName, int seatNumber ,double price ){
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	
	public void ticketBook(){
      System.out.println("------Your Ticket details are-------");
	  System.out.println("SeatNumber -- "+seatNumber);
	  System.out.println("price      -- "+price);
	  System.out.println("------------------------------------");
	    
	}
	
	
}