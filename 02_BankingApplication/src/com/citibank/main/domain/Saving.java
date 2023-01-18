package com.citibank.main.domain;

public class Saving extends Account {
	
	boolean isSalary;
	
	public Saving() {
		// TODO Auto-generated constructor stub
	}
	
	public Saving(int accountNumber, String name,double balance,boolean isSalary) {
		// TODO Auto-generated constructor stub
		super(accountNumber, name, balance);
		this.isSalary =isSalary;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	
	public boolean withdraw(double amount) {
		
		if (amount > 0  && amount <=getBalance())
		{
			if(isSalary)
			{
			setBalance(getBalance() - amount);
			return true;
		    }
		
			if(isSalary !=true && getBalance()-amount>=1500)
           {
	          setBalance(getBalance() - amount);
	          return true;
           }
					
	     }
		return false;
	
}

	@Override
	public boolean deposit(double amount) {
		if(amount> 0)
		{
			setBalance(amount + getBalance());
			return true;
		}
		return false;
	}
	
}
	
