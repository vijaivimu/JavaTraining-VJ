package com.citibank.main.domain;

public class Account {
	
	
	private double balance;
	
	
	


	public Account(double balance) {
	
		this.balance = balance;
	}
	
	

	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public boolean withdraw(double amount){
		
		System.out.println("withdraw Start");
		
		
		if (balance > amount)
		{
			balance = balance - amount;
			System.out.println("withdraw end");
			return true;
		}
		return false;
	}

	public boolean deposit(double amount){
		
		System.out.println("deposit start");
		balance = balance + amount;
		System.out.println("deposit end");
		return true;
	}

}
