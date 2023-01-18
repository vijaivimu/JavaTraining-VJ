package com.citibank.main;

import com.citibank.main.domain.*;

public class BankingApplicationMain {

	public static void main(String[] args) {
		System.out.println("main started");
		Account account = new Account();
//	    account.accountNumber = 101;
		account.setAccountNumber(101);
		System.out.println(account.getAccountNumber());
		account.withdraw();
		account.deposit(100);
		account.deposit(500);
		System.out.println(account.getBalance());
		System.out.println("main end");

	}

	
}
