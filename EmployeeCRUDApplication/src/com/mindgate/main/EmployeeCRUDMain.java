package com.mindgate.main;

import java.util.Scanner;
import java.util.Set;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeCRUDMain {
	public static void main(String[] args) {

		int choice;
		int employeeId = 0;
		String name = null;
		double salary = 0;
		Employee employee = null;
		String continueChoice;
		EmployeeDAO employeeDAO = new EmployeeDAO();

		do {
			System.out.println(" 1. Add new Employree" + "\n 2. Update Employee" + "\n 3. Delete Employee"
					+ "\n 4 Get Single Employee" + "\n 5. get All Employee" + "\n Enter your choice" + "\n Choice::");
			Scanner scanner = new Scanner(System.in);

			choice = scanner.nextInt();
			if (choice == 1 || choice == 2) {
				System.out.println("Enter EmployeeID");
				employeeId = scanner.nextInt();
				System.out.println("Enter Name");
				name = scanner.next();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();
				employee = new Employee(employeeId, name, salary);
			}
			switch (choice) {
			case 1:
				System.out.println(employee);
				if (employeeDAO.addNewEmployee(employee) == true) {
					System.out.println("Employee Added");
				}
				break;
			case 2:
				if (employeeDAO.updateEmployee(employee) == true) {
					System.out.println("Employee Details Updated");
				}
				break;
			case 3:
				System.out.println("Enter EmployeeID");
				employeeId = scanner.nextInt();
				if (employeeDAO.deleteEmployeeByEmployeeId(employeeId) == true)
					System.out.println("employee deleted");
				break;
			case 4:
				System.out.println("Enter EmployeeID");
				employeeId = scanner.nextInt();
				if (employeeDAO.getEmployeeByEmployeeId(employeeId) != null) {
					System.out.println(employeeDAO.getEmployeeByEmployeeId(employeeId));
				}

				break;

			case 5:
				Set<Employee> importedDetails = employeeDAO.getAllEmployee();
				for (Employee showDetails : importedDetails) {
					System.out.println(showDetails);
				}
				break;
			}
			System.out.println("Do you Want to Continue\n yes/no");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));

	}

}