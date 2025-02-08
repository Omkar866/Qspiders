package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ToLoadDriverClass 
{

	public static void main(String[] args) 
	{
		try 
		{
			String url = "jdbc:postgresql://localhost:5432/shop";
			String un="postgres";
			String password="root";
			//step 1 to load Driver class
			Class.forName("org.postgresql.Driver");
			Connection conn=DriverManager.getConnection(url,un,password);
			
			String sql="insert into product values (3,'Cricket Bat',500)";
			
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println(stmt.getUpdateCount()+" row inserted");
			
			stmt.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
