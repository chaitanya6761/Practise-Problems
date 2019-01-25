package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbc_Url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent"; 
		
		try {
			
			Connection myConn = DriverManager.getConnection(jdbc_Url, user, pass);
			System.out.println("Connection Sucessfull"+ myConn.isClosed());
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
