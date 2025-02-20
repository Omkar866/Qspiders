package com.bank.prc;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bank.entity.Account;
import com.bank.entity.Bank;

public class Test 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
//		Bank BOI = new Bank();
//		BOI.setName("BANK OF INDIA");
//		BOI.setBranch("MANJIRI");
//		
//		Bank BOM = new Bank();
//		BOM.setName("BANK OF MAHARASHTRA");
//		BOM.setBranch("Karvenagar");
//		
//		Account a1 = new Account();
//		a1.setBal(150000.45);
//		a1.setName("Sanket Pawar");
//		
//		Account a2 = new Account();
//		a2.setBal(47852.6);
//		a2.setName("Omkar Balwade");
//		
//		Account a3 = new Account();
//		a3.setBal(456214.0);
//		a3.setName("Tejas Lankeshwar");
//		
//		Account a4 = new Account();
//		a4.setBal(748569);
//		a4.setName("Shreyas Nimonkar");
//		
//		Account a5 = new Account();
//		a5.setBal(1770000.45);
//		a5.setName("Sanket Pawar");
//		
//		Account a6 = new Account();
//		a6.setBal(85475);
//		a6.setName("Omkar Balwade");
//		
//		Account a7 = new Account();
//		a7.setBal(65235);
//		a7.setName("Arun Pawar");
//		
//		Account a8 = new Account();
//		a8.setBal(1032542.4);
//		a8.setName("Virat Kohli");
//		
//		BOI.addAccount(a1);
//		BOI.addAccount(a2);
//		BOI.addAccount(a3);
//		BOI.addAccount(a4);
//		
//		BOM.addAccount(a5);
//		BOM.addAccount(a6);
//		BOM.addAccount(a7);
//		BOM.addAccount(a8);
//		
//		
//		
//		em.persist(BOM);
//		em.persist(BOI);
//		em.persist(a1);
//		em.persist(a2);
//		em.persist(a3);
//		em.persist(a4);
//		em.persist(a5);
//		em.persist(a6);
//		em.persist(a7);
//		em.persist(a8);
		
		
//		for(Bank b:(List <Bank>) em.createQuery("select b from Bank b").getResultList())
//		{
//			System.out.println(b.getName()+"\t"+b.getBranch());
//			for(Account acc : b.getAccounts())
//			{
//				System.out.println(acc.getAccNo()+"\t"+acc.getName()+"\t"+acc.getBal());
//			}
//		}
		

		
		
		
		
		
	
		
		
		
		
		
		et.commit();
		
		
	}

}
