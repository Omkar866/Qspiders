package com.jdbc.controller;

import com.jdbc.dao.EmployeeDao;
import com.jdbc.entity.Employee;

public class EmployeeController 
{
	EmployeeDao ed = new EmployeeDao();
	
	public void addEmployee(Employee e)
	{
		ed.addEmployee(e);
	}
	
	public void getEmployee()
	{
		ed.getEmployee();
	}
	

}
