package com.employee.pojo;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	//double amount;
	
	 //default
	public Employee() {
	}


	//parameterized
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}


	//getter & setter
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public boolean credit(double amount)
	{
		if(amount>0)
		{
			salary=salary+amount;
			return true;
		}
		else
		
		return false;
	}
	
	public boolean debited(double amount)
	{
		if(amount<salary)
		{
			salary=salary-amount;
			return true;
		}
		else
		{
			System.out.println("falied");
			return false;
		}
	}
	
	
	

}
