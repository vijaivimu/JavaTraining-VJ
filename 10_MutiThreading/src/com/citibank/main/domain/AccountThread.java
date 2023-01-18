package com.citibank.main.domain;

public class AccountThread implements Runnable {
	
	int choice;
	Account account;
	double amount;
	
	

	





	public AccountThread(int choice, Account account, double amount) {
	
		this.choice = choice;
		this.account = account;
		this.amount = amount;
	}









	@Override
	public void run() {
		
		if (choice==1)
		{
			account.deposit(amount);
		}
		
		if (choice==2)
		{
			account.withdraw(amount);
			
		
		}
		// TODO Auto-generated method stub
		
		
	}

	
}
