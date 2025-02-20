package com.emp.servlets;

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

import com.emp.entity.Employee;

@WebServlet("/request")
public class EmployeeDAOServlet extends HttpServlet
{
	static EntityManagerFactory emf;
	static
	{
		emf=Persistence.createEntityManagerFactory("hari");
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("json");
		PrintWriter pw = resp.getWriter();
		pw.write("[");
		EntityManager em=emf.createEntityManager();
		for(Employee e :(List <Employee>) em.createQuery("select e from Employee e").getResultList())
		{
			pw.write("{");
            pw.write("\"id\": " + e.getId() + ",");
            pw.write("\"name\": \"" + e.getName() + "\",");
            pw.write("\"salary\": " + e.getSalary() + ",");
            pw.write("\"email\": \"" + e.getEmail() + "\"");
            pw.write("}");


            pw.write(",");


		}



		pw.write("]");
		pw.close();
		em.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name = req.getParameter("name");
        String email = req.getParameter("email");
        double salary =Double.valueOf(req.getParameter("salary"));

        Employee e = new Employee();

        e.setName(name);
        e.setSalary(salary);

        e.setEmail(email);

        EntityManager em = emf.createEntityManager();
        try
        {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        resp.setContentType("application/json");
		PrintWriter pw = resp.getWriter();
		pw.print("{");
		pw.write("msg:"+"\"Employee added \"");
		pw.print("}");
        }
        catch(Exception e1)
        {
        	resp.setContentType("json");
    		PrintWriter pw = resp.getWriter();
    		pw.print("{");
    		pw.write("msg:"+"\"Failed to add employee \"");
    		pw.print("}");
    		System.out.println(e1.getMessage());

        }











	}



}

