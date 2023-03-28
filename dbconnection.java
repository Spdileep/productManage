package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
	public void getconnection() throws SQLException
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","admin");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return;
		
		
	}

}
