package com.mindgate.pojo;

public class Savings extends Account {
	
	private boolean isSalary;
	
	//default constructor
	public Savings() {
	System.out.println("default constructor of saving");
	}

	//overloaded const. savings
	public Savings(int accountnumber, String name, double balance, boolean isSalary) {
		super(accountnumber, name, balance);
		this.isSalary = isSalary;
		System.out.println("Overloaded const. of savings");
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		if(amount>0)
		{
			if(isSalary && amount<=getBalance())
			{
				setBalance(getBalance()- amount);
				return true;
			}
			if(isSalary ==false && getBalance()-amount >=1500)
			{
				setBalance(getBalance()- amount);
				return true;
			}
			
		}
		// TODO Auto-generated method stub
		return super.withdraw(amount);
	}
	
	@Override
	public boolean deposite(double amount) {
		return super.deposite(amount);
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public String toString() {
		return "Savings [isSalary=" + isSalary + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
