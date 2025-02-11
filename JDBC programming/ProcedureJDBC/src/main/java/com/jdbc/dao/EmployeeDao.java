package com.jdbc.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.entity.Employee;

public class EmployeeDao 
{
	public void addEmployee(Employee e)
	{
		
		String sql = "insert into employee values (?,?,?)";
		String url = "jdbc:postgresql://localhost:5432/employees?user=postgres&password=root";
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1,e.getId());
			pstmt.setString(2,e.getName());
			pstmt.setDouble(3,e.getSal());
			
			pstmt.execute();
			pstmt.close();
			conn.close();
			
			
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void getEmployee()
	{
		String sql = "select * from employee";
		String url = "jdbc:postgresql://localhost:5432/employees?user=postgres&password=root";
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url);
			Statement stmt= conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
				
			}
			stmt.close();
			conn.close();
			
			
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
