package com.course.prc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.course.entity.Student;
import com.course.entity.Subject;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Subject coreJava = new Subject();
		Subject webTech = new Subject();
		Subject sql = new Subject();
		Subject advJava = new Subject();
		
		coreJava.setName("Core Java");
		webTech.setName("Web Technologies");
		sql.setName("Structured Query Language");
		advJava.setName("Advanced Java");
		
		Student sanket = new Student();
		Student omkar = new Student();
		Student tejas = new Student();
		Student shreyas = new Student();
		
		sanket.setName("Sanket Pawar");
		omkar.setName("Omkar Balwade");
		tejas.setName("Tejas Lankeshwar");
		shreyas.setName("Shreyas Nimonkar");
		
		
		
		omkar.addSubject(webTech);
		omkar.addSubject(sql);
		omkar.addSubject(advJava);
		omkar.addSubject(coreJava);
		
		sanket.addSubject(sql);
		sanket.addSubject(advJava);
		sanket.addSubject(webTech);
		sanket.addSubject(coreJava);
		
		shreyas.addSubject(webTech);
		shreyas.addSubject(coreJava);
		
		tejas.addSubject(webTech);
		tejas.addSubject(coreJava);
		
		
		et.begin();
		
		em.persist(coreJava);
		em.persist(advJava);
		em.persist(webTech);
		em.persist(sql);
		
		em.persist(shreyas);
		em.persist(tejas);
		em.persist(omkar);
		em.persist(sanket);
		
		for(Student s :(List <Student>) em.createQuery("select s from Student s").getResultList())
		{
			System.out.println(s.getName());
			System.out.println("========");
			for(Subject i:s.getSubjects())
				System.out.println(i.getName());
			System.out.println("------------");
		}
		
		
		et.commit();

	}

}
