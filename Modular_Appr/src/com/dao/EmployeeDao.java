package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {

	public void insetData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded succesfully");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tka", "root", "root");

		Statement s = c.createStatement();
		int result = s.executeUpdate("insert into employee(empID, empName, city) values(101, 'Om', 'Nashik')");
		if (result > 0) {
			System.out.println("Data inserted successfully!");
		} else {
			System.out.println("Data not inserted!");
		}
	}


	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded succesfully");
	
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tka","root","root");
	
		Statement s = c.createStatement();
		int update = s.executeUpdate("update employee set empName='Jay' where empID=104");
		if(update>0) {
			System.out.println("Data updated Successfully!");
		}else {
			System.out.println("Data not updated!");
		}
	}
	
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded succesfully");
	
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tka","root","root");
	
		Statement s = c.createStatement();
		int delete = s.executeUpdate("delete from employee where empID=103");
		if(delete>0) {
			System.out.println("Data deleted Successfully!");
		}else {
			System.out.println("Data not deleted!");
		}
	}
	
	public void getAllRecords() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded succesfully");
	
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tka","root","root");
	
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getString(3));
		}
	}
}
