package com.product.prc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.product.entity.Product;
import com.product.entity.Review;

public class Test 
{

	public static void main(String[] args) 
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
//		Product p1 = new Product();
//		Product p2 = new Product();
//		
//		p1.setName("Amaz Mike");
//		p2.setName("Walkie Takie");
//		
//		p1.setPrice(4000);
//		p2.setPrice(750);
//		
//		Review r1 = new Review();
//		Review r2 = new Review();
//		Review r3 = new Review();
//		Review r4 = new Review();
//		
//		Review r5 = new Review();
//		Review r6 = new Review();
//		Review r7 = new Review();
//		Review r8 = new Review();
//		
//		r1.setProduct(p1);
//		r2.setProduct(p1);
//		r3.setProduct(p1);
//		r4.setProduct(p1);
//		
//		r5.setProduct(p2);
//		r6.setProduct(p2);
//		r7.setProduct(p2);
//		r8.setProduct(p2);
//		
//		r1.setComment("Good");
//		r1.setRating(5);
//		r2.setComment("Nice");
//		r2.setRating(4.9f);
//		r3.setComment("Not working as expected");
//		r3.setRating(1.0f);
//		r4.setComment("Waste");
//		r4.setRating(0.0f);
//		
//		r5.setComment("Nice product");
//		r5.setRating(4.8f);
//		r6.setComment("Good product");
//		r6.setRating(5.0f);
//		r7.setComment("Not satisfied with the product");
//		r7.setRating(3.0f);
//		r8.setComment("good");
//		r8.setRating(4.5f);
		
		
		
		
		
		
		
		
		et.begin();
		
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(r1);
//		em.persist(r2);
//		em.persist(r3);
//		em.persist(r4);
//		em.persist(r5);
//		em.persist(r6);
//		em.persist(r7);
//		em.persist(r8);
		
		
		for(Review r :(List <Review>) em.createQuery("select r from Review r").getResultList())
		{
			System.out.println(r.getId());
			System.out.println(r.getProduct().getName());
			System.out.println(r.getRating());
			System.out.println(r.getComment());
			System.out.println("\n\n================");
			
		}
		
		
		
		
		et.commit();
		

	}

}
