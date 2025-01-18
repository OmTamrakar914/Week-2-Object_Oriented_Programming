// creating class for ATM Stimulation

// created a student class to create a student report

import java.util.Scanner;
public class Atm2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the bank account number : ");
		long accountNumber = sc.nextLong();
		System.out.println("Enter the accountHolder name  : ");
		String accountHolder = sc.next();
		System.out.println("Enter the balance : ");
	    long balance = sc.nextLong();
		
		BankAccount obj = new BankAccount(accountNumber,accountHolder,balance);
		obj.display();
		
		System.out.println("Enter the amount to deposited : ");
		long amount = sc.nextLong();
		
		System.out.println("Enter the new Account Balace is : "+ obj.deposit(amount));
		 
		System.out.println("Enter the amount to deposited : ");
		long drawAmount = sc.nextLong();
		System.out.println("Enter the new Account Balace is : "+ obj.withdrawing(drawAmount));
			
		sc.close();
	}
}

// creating the Student class
public class BankAccount{
	long accountNumber;
	String accountHolder;
	long balance;
	
	//constructor
	BankAccount(long accountNumber, String accountHolder, long balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	//depositing money
	public long deposit(long amount){
		balance += amount;
		return balance;
	}
	
	//withdrawing money
	public long withdrawing (long drawAmount){
		if(balance < drawAmount){
			System.out.println("balance is not sufficient!");
		}
		else{
			balance -= drawAmount;
		}
		return balance;
	}
	
	public void display(){
		System.out.println("-------The Item details-------");
		System.out.println("The accountNumber is - "+accountNumber );
		System.out.println("The accountHolder is - "+accountHolder);
		System.out.println("The balance is    - "+balance);
		System.out.println("------------------------------");
		
	}
}