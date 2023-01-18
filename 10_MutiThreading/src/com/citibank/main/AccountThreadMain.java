package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.AccountThread;

public class AccountThreadMain {

	public static void main(String[] args) {
		
		int choice;
		double amount = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw ");
		System.out.println("Enter your choice:");
		choice = scanner.nextInt();
		
		Account account = new Account(50000);
		System.out.println("Balance" + account.getBalance());
		
		if (choice ==1)
		{
			System.out.println("Enter deposit amount");
			amount=scanner.nextDouble();
		}
		if (choice ==2)
		{
			System.out.println("Enter withdraw amount");
			amount = scanner.nextDouble();
		}
		
		Thread thread = new Thread(new AccountThread(choice,account,amount));
		thread.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Balance" + account.getBalance());
		
		
		

	}

}
