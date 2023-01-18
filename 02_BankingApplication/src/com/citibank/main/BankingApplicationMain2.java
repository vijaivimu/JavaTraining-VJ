package com.citibank.main;

import java.util.Scanner;


import com.citibank.main.domain.Account;

public class BankingApplicationMain2 {

	public static void main(String[] args) {
		
		Integer choice;
		Double amount;
		String continueChoice;
		// TODO Auto-generated method stub
		System.out.println("Welcome to ABC");
		Scanner scanner = new Scanner(System .in);
		
		System.out.println("Enter Account Number");
		int accountNumber= scanner.nextInt();
		System.out.println("Enter Name ");
		String name= scanner.next();
		System.out.println("Enter Balance ");
		double balance = scanner.nextDouble();
		
		
		 Account account = new Account(accountNumber,name,balance);
//		 account.setAccountNumber(accountNumber);
//		 account.setName(name);
//		 account.setBalance(balance);
		 
		 System.out.println("Your account is opened successfully");
		 System.out.println("Account number:" + account.getAccountNumber());
		 System.out.println("Name" + account.getName());
		 System.out.println("Balance" + account.getBalance());
		 do { 
		 System.out.println();
		 System.out.println("transction Menu");
		 System.out.println("Press 1  for Withdraw");
		 System.out.println("press 2 for Deposit");
		 System.out.println("press 3 for check balance");
		 System.out.println("Press 4 for exit");
		 choice = scanner.nextInt();
		 
		 switch(choice)
		 {
		 case 1:
			 System.out.println("Enter amount to withdraw");
			 amount= scanner.nextDouble();
			 if(account.withdraw(amount))
			 {System.out.println("withdraw successful");
			 }
			 else
			 {
				 System.out.println("withdraw failed");
			 }
			 break;
		 case 2:
			 System.out.println("Enter amount to deposit");
			 amount= scanner.nextDouble();
			 if(account.deposit(amount))
			 {System.out.println("deposit successful");
			 }
			 else
			 {
				 System.out.println("deposit failed");
			 }
			 break;	
		 case 3:
			 System.out.println(account.getBalance());
			 break;
		 case 4:
			 System.exit(0);
			 break;
		default:
			System.out.println("Invalid Choice");
			break;
		 }
		 System.out.println("Do you want to continue?");
		 continueChoice = scanner.next();
		 
		}while(continueChoice.equals("yes"));
		
       System.out.println("Thank you");
	}

}
