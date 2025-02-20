package com.car.prc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.car.entity.Car;
import com.car.entity.Engine;
import com.mobile.entity.Battery;
import com.mobile.entity.Mobile;

public class Test {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
	
		
		et.begin();

		et.commit();

	}

}
