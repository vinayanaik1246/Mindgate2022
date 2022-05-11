package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class EmailNotification implements Notification{
	public void sendNotification(String to,String msg)
	{
		System.out.println("Sending Email notification");
		System.out.println("To::"+to);
		System.out.println("Message::"+msg);
	}
	

}
