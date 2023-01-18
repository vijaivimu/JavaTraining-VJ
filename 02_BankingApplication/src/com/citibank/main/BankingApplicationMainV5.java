package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

import com.citibank.main.domain.Current;

import com.citibank.main.domain.Saving;


public class BankingApplicationMainV5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Saving saving;
		
		int accountNumber;
		String name;
		double balance;
		int choice;
		double amount;
		String continueChoice;
		boolean isSalary;
		double overdraftLimit;
		

		System.out.println("Account Menu");
		System.out.println("1.Savings");
		System.out.println("2.Current");
		System.out.println("Enter your account choice");
		choice = scanner.nextInt();		
		System.out.println("Enter accountNumber");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		if (choice ==1)
		{

			System.out.println("Do you want to open salary account");
			isSalary = scanner.nextBoolean();
			

			Account account = new Saving(accountNumber, name, balance,isSalary);
			System.out.println("Account Opened Successfully!!");
			System.out.println("Account Number :: " + account.getAccountNumber());
			System.out.println("Name :: " + account.getName());
			System.out.println("Balance :: " + account.getBalance());
			//System.out.println("IsSalary :: " + account.isSalary());				
			do {
				showTransactionMenu(scanner, account);
				System.out.println("Do you want to continue?");
				continueChoice = scanner.next();
			} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("y"));
			System.out.println("Thank you!!");				
			
			
			
		}
		if (choice ==2)
		{
			System.out.println("Enter overdraft limit amount");
			overdraftLimit = scanner.nextDouble();			
			Account account = new Current(accountNumber, name, balance,overdraftLimit);
			do {
				showTransactionMenu(scanner, account);
				System.out.println("Do you want to continue?");
				continueChoice = scanner.next();
			} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("y"));
			System.out.println("Thank you!!");				
			
			
		}		
		
		
		

	}

	private static void showTransactionMenu(Scanner scanner, Account account) {
		char choice;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("Press 1. For Withdraw");
		System.out.println("Press 2. For Deposit");
		System.out.println("Press 3. For Check Balance");
		System.out.println("Press 4. For Exit");
		System.out.println("Enter your choice");
		choice = scanner.next().charAt(0);

		switch (choice) {
		case '1':
			System.out.println("Enter amount to Withdraw");
			amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("Withdraw Successfull!");
			else
				System.out.println("Withdraw Failed");
			break;
		case '2':
			System.out.println("Enter amount to Deposit");
			amount = scanner.nextDouble();
			if (account.deposit(amount))
				System.out.println("Deposit Successfull!");
			else
				System.out.println("Deposit Failed");
			break;

		case '3':
			System.out.println("Balance :: " + account.getBalance());
			break;
		case '4':
			System.out.println("Thank you!!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
	


}	
	

