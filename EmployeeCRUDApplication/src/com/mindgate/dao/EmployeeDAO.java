package com.mindgate.dao;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Set<Employee> employeeSet = new HashSet<Employee>();

	public boolean addNewEmployee(Employee employee) {
		if (employee != null) {

			return employeeSet.add(employee);

		}

		return false;
	}

	public boolean updateEmployee(Employee employee) {
		for (Employee databaseEmployees : employeeSet) {
			if (databaseEmployees.getEmpId() == employee.getEmpId()) {
				databaseEmployees.setName(employee.getName());
				databaseEmployees.setSalary(employee.getSalary());
				return true;
			}

		}
		return false;
	}

	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee databaseEmployees : employeeSet) {
			if (databaseEmployees.getEmpId() == employeeId) {
				employeeSet.remove(databaseEmployees);
				return true;
			}

		}
		return false;

	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee databaseEmployees : employeeSet) {
			if (databaseEmployees.getEmpId() == employeeId) {
				return databaseEmployees;

			}
		}
		return null;

	}

	public Set<Employee> getAllEmployee() {
//		System.out.println(employeeSet);
		return employeeSet;
	}
}
