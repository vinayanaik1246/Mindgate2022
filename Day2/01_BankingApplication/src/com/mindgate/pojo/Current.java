package com.mindgate.pojo;

public class Current extends Account{
	private double overdraftBalance=50000;
	
	public Current() {
	}

	public Current(int accountnumber, String name, double balance, double overdraftBalance) {
		super(accountnumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("overloaded constructor of current");
		
		
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(amount>0)
		{
			if(amount <getBalance())
			{
				setBalance(getBalance()- amount);
				
				
				return true;
			}
			if(amount>getBalance())
			{
			
				setBalance(amount-getBalance());
				
				setOverdraftBalance(getOverdraftBalance()-getBalance());
				setBalance(0);
						
				return true;

			}
		}
		return false;
	}
	
	@Override
	public boolean deposite(double amount)
	{
		if(amount>0 && getOverdraftBalance()==overdraftBalance) {
		
		
			setBalance(getBalance()+amount);
			
			return true;
		
		}
		
		else
		{
			setOverdraftBalance(getOverdraftBalance()+amount);
			return false;

		}
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
