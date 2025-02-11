package com.jdbc.view;

import com.jdbc.controller.EmployeeController;
import com.jdbc.entity.Employee;

public class EmployeeView 
{
	public static void main(String[] args) 
	{
		
		Employee e = new Employee(3,"Ram",400000);
		EmployeeController ec = new EmployeeController();
		ec.addEmployee(e);
		System.out.println("Employee added");
		ec.getEmployee();
		
	}

}
