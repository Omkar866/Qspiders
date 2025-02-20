package com.emp.view;

import com.emp.dao.EmployeeDao;
import com.emp.entity.Employee;

public class EmployeeView 
{
	public static void main(String[] args) 
	{
		Employee e= new Employee();
		e.setName("Sanket");
		e.setSal(50000.0);
		
		EmployeeDao edao = new EmployeeDao();
		edao.addEmployee(e);
		
	}

}
