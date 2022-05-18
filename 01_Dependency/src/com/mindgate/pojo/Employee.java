package com.mindgate.pojo;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	private Address homeAddress;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, double salary, Address homeAddress) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
	}

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

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", homeAddress=" + homeAddress
				+ "]";
	}
	
	
	

}
