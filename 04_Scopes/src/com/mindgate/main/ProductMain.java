package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Product;

public class ProductMain {
	public static void main(String[] args) {
		System.out.println("Main start");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("application context created");
		
		
		Product product=applicationContext.getBean("product",Product.class);
		System.out.println("product created");
		System.out.println(product);
		System.out.println(product.hashCode());
		System.out.println("*".repeat(50));
		
		Product product1=applicationContext.getBean("product1",Product.class);
		System.out.println("product created");
		System.out.println(product1);
		System.out.println(product1.hashCode());

		System.out.println("main ends");
	}
}
