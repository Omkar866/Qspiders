package com.prc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prc.entities.Employee;

@WebServlet("/reg")
public class Register extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("name");
        String age = req.getParameter("age");
        String salary = req.getParameter("salary");
        String email = req.getParameter("email");

        // Setting response content type
        
        Employee e1 = new Employee();
       
        e1.setName(name);
        e1.setAge(Integer.valueOf(age));
        e1.setEmail(email);
        e1.setSalary(Double.valueOf(salary));
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        em.persist(e1);
        
        em.getTransaction().commit();
        
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.write("<h1>Employee added successfully </h1>");
        em.close();
        emf.close();
       	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("application/json");
		
		PrintWriter pw = resp.getWriter();	
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
	        EntityManager em = emf.createEntityManager();
		
		List<Employee> employees = em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();

        // Start JSON array
        pw.write("[");
        
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);

            // Create JSON object
            pw.write("{");
            pw.write("\"id\": " + e.getId() + ",");
            pw.write("\"name\": \"" + e.getName() + "\",");
            pw.write("\"age\": " + e.getAge() + ",");
            pw.write("\"salary\": " + e.getSalary()+",");
            pw.write("\"email\": \"" + e.getEmail()+"\"");
            pw.write("}");

            // Add comma except for the last object
            if (i < employees.size() - 1) {
                pw.write(",");
            }
        }

        // End JSON array
        pw.write("]");
		
		
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id=Integer.valueOf(req.getParameter("id"));
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
        EntityManager em = emf.createEntityManager();
	
        em.getTransaction().begin();
        Employee employee = em.find(Employee.class, id);
        
        // If the employee exists, remove it
        if (employee != null) {
            em.remove(employee);
        }
        em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("name");
        String age = req.getParameter("age");
        String salary = req.getParameter("salary");
        String email = req.getParameter("email");
        String id=req.getParameter("id");
        
        System.out.println("Hii");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
        EntityManager em = emf.createEntityManager();
	
        em.getTransaction().begin();
        
        Employee e1 = new Employee();
        e1.setId(Integer.valueOf(id));
        e1.setName(name);
        e1.setSalary(Double.valueOf(salary));
        e1.setEmail(email);
        e1.setAge(Integer.valueOf(age));
        
        
        em.merge(e1);
        
        em.getTransaction().commit();
        
        
		
	}

}
