package com.shoolini.project.utility;
import java.util.*;

import java.sql.Connection;


import java.sql.DriverManager;


public class DbConnection {
	
	private static Connection con = null;
	public static Connection getConnection()
	{
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoolini", "root", "T#9758@qlph");
			
			
			
			Properties properties=new Properties();
			properties.setProperty("user", "root");
			properties.setProperty("password", "T#9758@qlph");
			con=DriverManager .getConnection("jdbc:mysql://localhost:3306/shoolini",properties);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		Connection connection = DbConnection.getConnection();
		if(connection!=null)
		{
			System.out.println("Connected...");
		}
		else
		{
			System.out.println("Not Conneted somthing went wrong");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	


