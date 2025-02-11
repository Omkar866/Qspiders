package com.prc.view;

import com.prc.Controller.CustomerController;
import com.prc.dto.Customer;

public class CustomerView 
{
	public static void main(String[] args) 
	{
		
		CustomerController cc = new CustomerController();
		
		cc.add(new Customer(1,"anc","wert"));
		
		
		
		
		
	}

}
