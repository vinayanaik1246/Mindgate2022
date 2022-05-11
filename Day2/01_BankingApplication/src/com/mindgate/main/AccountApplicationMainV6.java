package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationMainV6 {
	
	public static void main(String[] args) {
		
		Current current=new Current(101, "vinaya", 10000, 50000);
		
		System.out.println(current);
		current.withdraw(5000);
		System.out.println(current);
		
		current.withdraw(20000);
		System.out.println(current);
		
		current.withdraw(10000);
		System.out.println(current);
		
		
		current.deposite(10000);
		System.out.println(current);


		
	}

}
