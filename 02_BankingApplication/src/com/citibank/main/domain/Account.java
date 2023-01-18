package com.citibank.main.domain;

public abstract class Account {
	
	protected int accountNumber;
	private String name;
	private double balance;
	
    public  Account() {
		// TODO Auto-generated constructor stub
    	System.out.println("default constructor");
	}
    
    public Account(int accountNumber, String name, double balance) {
		// TODO Auto-generated constructor stub
    	System.out.println("inside para constructor");
    	this.accountNumber = accountNumber;
    	this.name= name;
    	this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	public abstract boolean withdraw(double amount);
//	{
////		System.out.println("withdraw called");
////		if(amount>0 && amount <=balance)
////		{
////			balance = balance - amount;
////			return true;
////		}
////		return false;
//	}
	
	public abstract boolean deposit(double amount);
//	{
////		System.out.println("deposit called"); 
////		if( amount>0)
////		{
////			balance = balance + amount;
////			return true;
////		}
////		return false;
//	}
}
