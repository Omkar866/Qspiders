package com.prc.Controller;

import com.prc.dao.CustomerDao;
import com.prc.dto.Customer;

public class CustomerController 
{
	CustomerDao cdao = new CustomerDao();
	
	public void add(Customer c)
	{
		cdao.addCustomer(c);
	}
	public void getById(int id)
	{
		cdao.getCustomerById(id);
	}
	public void getAll()
	{
		cdao.getAll();
	}
	public void deleteById(int id)
	{
		cdao.deleteCustomerById(id);
	}
}
