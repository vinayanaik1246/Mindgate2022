package com.employee.main;

import java.util.Scanner;

import com.employee.pojo.Employee;

public class EmployeeApplication {
	public static void main(String[] args) {
		Employee employee=new Employee(1, "vinaya", 10000);
		
		int employeeId;
		String name;
		double salary;
		double amount;
		boolean result;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter id:");
		employeeId=scanner.nextInt();
		
		System.out.println("enter name");
		name=scanner.next();
		
		System.out.println("enter salary");
		salary=scanner.nextDouble();
		
		employee.setEmpId(employeeId);
		employee.setName(name);
		employee.setSalary(salary);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		
		System.out.println("enter choice \n 1.credit \n 2.debit");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:System.out.println("enter amount to be credited");
				amount=scanner.nextInt();
				result=employee.credit(amount);
				if(result)
				{
					System.out.println("successfully credited");
					System.out.println("salary"+employee.getSalary());
				}
				else
				{
					System.out.println("unsuccessful");
					System.out.println("salary"+employee.getSalary());
				}
				break;
				
		case 2:System.out.println("enter amount to be debited");
				amount=scanner.nextInt();
				result=employee.debited(amount);

			
		}
		
		
		
		
	}

}
