package com.mindgate.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
@Scope("prototype")
public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	@Autowired
	private Address homeAddress;
	
	public Employee() {
		System.out.println("Employee default constrctor called");	
	}

	public Employee(int empId, String name, double salary, Address homeAddress) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
		System.out.println("Employee overloaded constrctor called");	

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		System.out.println("setting id:"+empId);
		this.empId = empId;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		System.out.println("setting name:"+name);

		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("setting salary:"+salary);

		this.salary = salary;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		System.out.println("setting homeAddress:"+homeAddress);

		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", homeAddress=" + homeAddress
				+ "]";
	}
	
	
	

}
