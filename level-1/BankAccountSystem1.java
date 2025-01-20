// creating a class with this , static , and final keywords for Bank account system

public class BankAccountSystem1{
	public static void main(String []args){
		// created objects of class BankAccount
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("Om Tamrakar");
		
		//calling the display method
		BankAccount.display(account1);
		BankAccount.display(account2);
		
		//calling returntotalcount method
		 System.out.println("The Total number of bank accounts in the Bank is : "+BankAccount.returnAccounts());
	}
}
public class BankAccount{
	static String bankName = "HDFC"; // declared static variable and initialized
	String accountHolderName;        
	final long accountNumber;        //declared final variable
	static int totalCount;           //declared static variable
	
	//default constructor
	BankAccount(){
		this("Guest");
    } 

    //parameterized constructor
    BankAccount(String accountHolderName){
		this.accountHolderName = accountHolderName;
		totalCount++;
		accountNumber = 10000+totalCount;
    } 	
	// method to return totalaccount
	public static int returnAccounts(){
		return totalCount;
	}
	
	// method for displaying the bank details
	public static void display(BankAccount account){
		//checking the object is an instance of class or not
	  if(account instanceof BankAccount){
	  System.out.println("/n-------------Bank Account Details---------------" );
	  System.out.println("The Account number is      : "+account.accountNumber);
	  System.out.println("The Account Holder name is : "+account.accountHolderName);
	  System.out.println("The Bank is                : "+account.bankName);
	  System.out.println("------------------------------------------------" );
	  }else{
		  System.out.println("account is not an instance of class BankAccount");
	  }
	}
}