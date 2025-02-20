package com.prc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		
		String jpql = "Select x from Student x";
		
		
		
		et.begin();
		
		Query query = em.createQuery(jpql);

		
		System.out.println(query.getResultList());
		

		
		et.commit();

	}

}
