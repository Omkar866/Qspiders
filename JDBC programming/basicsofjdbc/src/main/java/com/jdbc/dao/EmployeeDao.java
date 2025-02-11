package com.jdbc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.entity.Employee;

public class EmployeeDao 
{
	public void addEmployee(Employee e)
	{
		
		String sql = "insert into employee values (?,?,?)";
		String url = "jdbc:postgresql://localhost:5432/shop?user=postgres&password=root";
		
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

}
