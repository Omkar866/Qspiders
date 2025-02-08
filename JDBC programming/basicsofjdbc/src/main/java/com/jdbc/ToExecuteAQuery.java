package com.jdbc;

public class ToExecuteAQuery {

	public static void main(String[] args) 
	{
		//Load the jdbc driver
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Yo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
