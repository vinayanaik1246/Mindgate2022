package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {

	public static void main(String[] args) {
		
		Account account=new Account(101, "vini", 150);
		// withdraw cash
		boolean result =account.withdraw(500);
		if(result)
		{
			System.out.println("successful");
			System.out.println("balance--"+account.getBalance());
		}
		else
		{
			System.out.println("unsuccessful");
			System.out.println("balance--"+account.getBalance());
		}
		
		//deposite cash
		result=account.deposite(500);
		
		if(result)
		{
			System.out.println("successful");
			System.out.println("balance--"+account.getBalance());
		}
		else
		{
			System.out.println("unsuccesfull");
			System.out.println("balance--"+account.getBalance());

		}
	}
}
