package com.inheritance.prc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.inheritance.entity.Developer;
import com.inheritance.entity.Employee;
import com.inheritance.entity.Manager;

public class Test 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Developer d1 = new Developer();
		Developer d2 = new Developer();
		
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		
		d1.setName("Rahul Verma");
		d1.setProgrammingLanguage("Python");
		d2.setName("Vijay Sharma");
		d2.setProgrammingLanguage("Java");
		
		m1.setName("Bhau Patil");
		m1.setTeamSize(100);
		
		m2.setName("Daroga Singh");
		m2.setTeamSize(45);
		
		
		
		et.begin();
		
		em.persist(d1);
		em.persist(d2);
		em.persist(m1);
		em.persist(m2);
		
		
		for(Employee e : (List<Employee>) em.createQuery("Select e from Employee e").getResultList() )
		{
			System.out.println(e.getName());
			e.greet();
			System.out.println("================");
		}
		
		
		et.commit();
		
	}

}
