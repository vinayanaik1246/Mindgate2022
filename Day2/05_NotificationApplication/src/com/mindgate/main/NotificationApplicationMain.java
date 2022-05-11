package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.NotificationFactory;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.service.Notification;

public class NotificationApplicationMain {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String to;
		String msg;
		
		System.out.println("Enter contact:");
		to=scanner.next();
		msg=scanner.nextLine();

		
		System.out.println("Enter msg:");

		msg=scanner.nextLine();
		
		System.out.println("enter choice: \n 1.sms \n 2.email \n 3.whatsapp");
		int choice = scanner.nextInt();
		
		Notification notification=NotificationFactory.getNotification(choice);
		notification.sendNotification(to, msg);
	}

}
