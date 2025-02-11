package com.prc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.prc.dto.Customer;

public class CustomerDao 
{
	
	private Connection conn;
	{
		String url = "jdbc:postgresql://localhost:5432/shop?user=postgres&password=root";
		
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void addCustomer(Customer cust)
	{
		String sql = "insert into customer values (?,?,?)";
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,cust.getId());
			pstmt.setString(2,cust.getName());
			pstmt.setString(3,cust.getPhoneNo());
			pstmt.execute();
			System.out.println("Customer added");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}
	
	public void getAll()
	{
		String sql = "select * from customer";
		Statement stmt=null;
		
		try 
		{
			stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println("Id\tName\tPhoneno");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));				
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void getCustomerById(int id)
	{
		PreparedStatement pstmt=null;
		String sql = "select * from customer where id = ?";
		
		try 
		{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Id\tName\tPhoneno");
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));				
			}
			else
			{
				System.out.println("Customer with id "+id+" doesn't exists");
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void deleteCustomerById(int id)
	{
		PreparedStatement pstmt=null;
		String sql = "delete from customer where id = ?";
		
		try 
		{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			
			int rowAff=pstmt.executeUpdate();
			
			if(rowAff==1)
			{
				System.out.println("Employee deleted sucessfully");
			}
			else
				System.out.println("Employe with id "+id+" doesn't exists");
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	@Override
	protected void finalize() throws Throwable 
	{
		if(conn!=null ) conn.close();
	}

}
