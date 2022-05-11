package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int employeeId;
		String name;
		double salary;
		
		
		Employee employee=new Employee();
		System.out.println("enter id");
		employeeId=scanner.nextInt();
		
		System.out.println("enter name");
		name=scanner.next();
		
		System.out.println("enter salary");
		salary=scanner.nextDouble();
		
		employee.setEmployeeId(employeeId);
		employee.setName(name);
		employee.setSalary(salary);
		
		
		System.out.println("id"+employee.getEmployeeId());
		System.out.println("name"+employee.getName());
		System.out.println("salary"+employee.getSalary());
		
		

	}

}
