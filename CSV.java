package com.techpalle;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CSV {
 
	public static void main(String[] args) throws SQLException {
    try {
		PrintWriter pw=new PrintWriter(new File("https://www.walmart.com/browse/electronics/dell-gaming-laptops/3944_3951_7052607_1849032_4519159 \r\n"+"\r\n"+""));
		StringBuilder sb=new StringBuilder();
		Connection con=null;
		CSV obj_dbconnection=new CSV();
		Object con1=obj_dbconnection.getconnection();
		ResultSet rs=null;
		String query="select *from dell-gaming-laptops";
		PreparedStatement ps=con.prepareStatement(query);
	     rs=ps.executeQuery();
	     
	
		while(rs.next())
		{
			sb.append(rs.getString ("product name"));
			sb.append(",");
			sb.append(rs.getString ("product price"));
			sb.append(",");
			sb.append(rs.getString ("item number/sku/product code"));
			sb.append(",");
			sb.append(rs.getString ("model number"));
			sb.append(",");
			sb.append(rs.getString ("product category"));
			sb.append(",");
			sb.append(rs.getString ("product discription"));
			sb.append(",");
			
		}
		pw.write(sb.toString());
		pw.close();
		System.out.println("finished");
		
    
    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    
    
    
	
    
	}

	private Object getconnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
