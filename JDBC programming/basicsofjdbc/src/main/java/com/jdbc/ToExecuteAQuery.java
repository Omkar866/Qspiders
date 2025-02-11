package com.jdbc;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ToExecuteAQuery {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:postgresql://localhost:5432/shop?user=postgres&password=root";
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection conn = DriverManager.getConnection(url);
			
			String sql = "select * from product where id>=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);			
			
			System.out.println("enter id");
			int id=sc.nextInt();
			
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();	
			
			while(rs.next())
			{
				System.out.println("Id :- "+rs.getInt("id"));
				System.out.println("Name :- "+rs.getString("name"));
				System.out.println("Price :- "+rs.getDouble("cost"));
				System.out.println("-------------------------");
			}
			
			pstmt.close();
			conn.close();
			
			System.out.println("Sucess!!!!");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
