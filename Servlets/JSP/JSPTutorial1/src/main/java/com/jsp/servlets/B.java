package com.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/b")
public class B extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session = req.getSession();
		
		Student s = (Student) session.getAttribute("user");
		
		PrintWriter pw = resp.getWriter();
		
		
		pw.println("<h1>");
		pw.println(s.getName());
		pw.println(s.getEmail());
		pw.println("</h1>");
		
	}

}
