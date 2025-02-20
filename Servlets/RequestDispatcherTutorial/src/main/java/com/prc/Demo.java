package com.prc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/a")
public class Demo extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Demo");
		String a = req.getParameter("input1");
		String b = req.getParameter("input2");
		
		RequestDispatcher rd = req.getRequestDispatcher("/b");
		rd.forward(req, resp);
	}

}
