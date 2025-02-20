package com.jsp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/a")
public class A extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Student s = new Student();
		
		
		s.setName("Omkar");
		s.setEmail("omkarbalwade@gmail.com");
		
		
		HttpSession session = req.getSession();
		session.setAttribute("user",s);
		
		RequestDispatcher rd = req.getRequestDispatcher("b");
		rd.forward(req, resp);
		
	}
	

}
