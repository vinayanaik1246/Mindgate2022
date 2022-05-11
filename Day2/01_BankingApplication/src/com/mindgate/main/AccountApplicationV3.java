package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountApplicationV3 {
	

	public static void main(String[] args) {
		
		int accountNumber;
		String name;
		double balance;
		String continueChoice;
		boolean result;
		boolean isSalary;
		
		
		System.out.println("Welcome to Mindgate Bank....!");
		Scanner scanner=new Scanner(System.in);
		
		
		Account account=new Account(accountNumber, name, balance);

      
		System.out.println("Enter Account Number");
		accountNumber=scanner.nextInt();
		
		System.out.println("Enter name");
		name=scanner.next();
		
		System.out.println("Enter balance");
		balance=scanner.nextDouble();
		
		System.out.println("do you want to open salary acc");
		
		account.setAccountnumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);
		
		System.out.println("Acc opened successfully...!");
		
		do {
		System.out.println("Menu:");
		System.out.println("1.withdraw");
		System.out.println("2.Deposite");

		System.out.println("3.check Balance");
		
		System.out.println("Enter your choice:");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			System.out.println("enter amount to be withdraw");
			 result =account.withdraw(scanner.nextDouble());
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
		}
			else if(choice==2)
			{
				System.out.println("enter amount to be Deposite"
						+ "");

				 result=account.deposite(scanner.nextDouble());
				
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
		
			else if(choice==3)
			{
				System.out.println(account.getBalance());
		}
		
		
		
		
		System.out.println("do you want to continue");
		
		
		 continueChoice=scanner.next();
		}
		while(continueChoice.equals("yes"));

		System.out.println("Thank you..");
	}
}

