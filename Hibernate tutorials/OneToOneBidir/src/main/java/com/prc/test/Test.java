package com.prc.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.prc.entity.Car;
import com.prc.entity.Engine;

public class Test {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		Engine e1 = new Engine();
		Engine e2 = new Engine();
		Engine e3 = new Engine();
		
		c1.setModel("Tata");
		c2.setModel("BMW");
		c3.setModel("Ferrari");
		
		e1.setType("Petrol");
		e2.setType("Diseal");
		e3.setType("CNG");
		
		c1.setEngine(e1);
		e1.setC(c1);
		c2.setEngine(e2);
		e2.setC(c2);
		c1.setEngine(e3);
		e3.setC(c3);
		
		
		
		et.begin();
		
		
		
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		
		
		for(Engine e:(List <Engine>) em.createQuery("select e from Engine e").getResultList())
		{
			System.out.println(e.getType());
			System.out.println(e.getC().getModel());
		}
		
		
		
		
		et.commit();

	}

}
