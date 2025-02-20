package com.emp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.emp.entity.Employee;

public class EmployeeDao 
{
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hari");
	EntityManager em = emf.createEntityManager();
	
	public void addEmployee(Employee e)
	{
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
		System.out.println("Employee  added");
	}
	
	public void deleteEmployee(int id)
	{
		EntityTransaction et = em.getTransaction();
		et.begin();
		if(em.find(Employee.class,2)!=null)
		{
			em.remove(2);
			System.out.println("Entity removed");
		}
		else
				System.out.println("Entity to be deleted is not present");
		et.commit();
		
	}
	
	
	
	

}
