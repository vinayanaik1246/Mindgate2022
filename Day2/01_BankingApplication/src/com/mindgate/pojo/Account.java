package com.mindgate.pojo;

public class Account {
	private int accountnumber;
	private String name;
	private double balance;
	
	public Account() {
		System.out.println("default constructor of Account");
	}

	public Account(int accountnumber, String name, double balance) {
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
		System.out.println("overloaded constructor of Account");
	}
	
	

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
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
	
	
	public boolean withdraw(double amount)
	{
		if(amount > 0 && balance >=amount)
		{
			balance=balance-amount;
			return true;
		}
		return false;
		
	}
	
	public boolean deposite(double amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
