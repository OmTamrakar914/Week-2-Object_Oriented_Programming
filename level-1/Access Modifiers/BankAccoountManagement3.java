import java.util.Scanner;

public class BankAccoountManagement3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the accountNumber");
		long accountNumber = sc.nextLong();
		//sc.next();
		
		System.out.println("Enter the accountHolder Name");
		String accountHolder = sc.next();
		
		System.out.println("Enter the balance of the account");
		double balance = sc.nextDouble();
		
		BankAccount obj1 = new BankAccount();
		
		System.out.println("Enter the New balance : ");
		double newBalance = sc.nextDouble();
		
		//Setting the newBalance by calling modifyBalance method
		obj1.modifyBalance(newBalance);

		 //calling the getting the function
         double ans = obj1.accessBalance();
		System.out.println("the New balance is : "+ans);
		
		SavingsAccount obj2 = new SavingsAccount();
		
		System.out.println("Enter the new accountNumber");
		long newaccountNumber = sc.nextLong();
		
        obj2.modifyAccountNumber(newaccountNumber);
		long ans2 = obj2.accessAccountNumber();
		System.out.println("The new accountNumber : "+ans2);
		
		
		System.out.println("Enter the new accountHolder name : ");
		String newaccountHolder = sc.next();
        //modifying account holder
		obj2.modifyAccountHolder(newaccountHolder);
        // acceess account holder
		String updateTitle = obj2.accessAccountHolder();
		System.out.println("the new newaccountHolder is  : "+updateTitle);
		
	
    }
}

class BankAccount{
    public long accountNumber; // public data member
    protected String accountHolder;  // protected data member
    private double balance;   // private data member
    
    //default constructor
    BankAccount(){
        this.accountNumber = 0;
        this.accountHolder = "";
        this.balance = 0.0 ;
    }
     
     public double accessBalance(){
        return balance ;
     }

     public void modifyBalance(double balance){
        this.balance  = balance;
     }
    
}

class SavingsAccount extends BankAccount{
    //method to access the public members of the Book class
    public long accessAccountNumber(){
        return accountNumber ;
     }
     //metjod to modify account number
     public void modifyAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
     }
    //method to access the protected member
    public String accessAccountHolder(){
        return accountHolder ;
     }
     //method to modify acount holder name
     public void modifyAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
     }

}

