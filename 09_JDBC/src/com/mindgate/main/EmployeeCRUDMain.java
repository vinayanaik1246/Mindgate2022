package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.PartialResultException;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system	";
		String password="mindgate123";
		
		String driver="oracle.jdbc.driver.OracleDriver";
		int result=0;
		String sqlQuery="";
		
		Connection connection;
		//Statement statement;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet;
		
		
		
//		try {
//			Class.forName(driver);
//
//			connection=DriverManager.getConnection(url, user, password);
//			statement=connection.createStatement();
//			sqlQuery="select * from employee_details where employee_id=3";
//			resultSet=statement.executeQuery(sqlQuery);
//			
//			while(resultSet.next())
//			{
//				System.out.println(resultSet.getInt("employee_id"));
//				System.out.println(resultSet.getString("name"));
//				System.out.println(resultSet.getDouble("salary"));
//				System.out.println("-".repeat(50));
//			}
//
//			connection.close();
//
//		
//		}
//		
//		catch (ClassNotFoundException | SQLException e) {
//			System.out.println("exception");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {
		Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
			sqlQuery="DELETE employee_details where employee_id=?";
			preparedStatement=connection.prepareStatement(sqlQuery);
	     	preparedStatement.setInt(1,3);
			result=preparedStatement.executeUpdate();

			
			if(result>0)
				System.out.println("record deleted");
			else
				
				System.out.println("record not deleted");
	
			
		
			
			
			
			
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println("exception");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, password);
//			sqlQuery="update employee_details set name=? where employee_id=3";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "vinaya Mindgate");;
//			result=preparedStatement.executeUpdate();
//			
//			connection.close();
//			if(result>0)
//			{
//				System.out.println("updated");
//			}
//			else
//				System.out.println("not updated");
//			
//			
//		} 
//		
//		catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url,user,password);
//				sqlQuery="insert into employee_details(name,salary)values(?	,?)";
//				preparedStatement =connection.prepareStatement(sqlQuery);
//				preparedStatement.setString(1, "vinaya vivek naik");
//				preparedStatement.setDouble(2, 50000000);
//
//			result=preparedStatement.executeUpdate();
//			
//			connection.close();
//			
//			if(result>0)
//				System.out.println("record added");
//			else
//				
//				System.out.println("record not added");
//
//					
//		
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("exception");
//			e.printStackTrace();
//		}
		
	}

}
