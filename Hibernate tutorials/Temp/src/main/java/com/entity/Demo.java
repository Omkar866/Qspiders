package com.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction t1 = em.getTransaction();
		
		t1.begin();
		
		String jpql = "Select c from Course c";
		
		Query query = em.createQuery(jpql);
		
		
		Course r = (Course)query.getSingleResult();
		
		t1.commit();

	}

}
