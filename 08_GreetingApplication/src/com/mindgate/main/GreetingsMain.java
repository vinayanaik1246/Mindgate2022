package com.mindgate.main;

import com.mindgate.pojo.GoodMorningGreetings;
import com.mindgate.pojo.Greetings;

public class GreetingsMain {
	public static void main(String[] args) {

		
		Greetings greetings=()->System.out.println("Good afternoon"); 
		greetings.greet();
	}
}
