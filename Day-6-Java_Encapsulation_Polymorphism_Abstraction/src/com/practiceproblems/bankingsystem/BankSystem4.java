package com.practiceproblems.bankingsystem;

public class BankSystem4 {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount("123456789", 500.0,"Anush",5,true);

        // Display account information
        account1.displayAccountInfo();

        // Deposit money
        account1.deposit(150.0);
        account1.displayAccountInfo();

        // Withdraw money
        account1.withdraw(100.0);
        account1.displayAccountInfo();

        CurrentAccount account2=new CurrentAccount("3757512398",1000,"Ojas",5,false);
        account2.displayAccountInfo();
        account2.calculateLoanEligibility();

    }
}

