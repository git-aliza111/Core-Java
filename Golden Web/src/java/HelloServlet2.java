package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet2
 */
@WebServlet("/HelloServlet2")
public class HelloServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
//		System.out.println("name is...."+name);
//		response.setContentType("type/html");
//		ServletOutputStream out=response.getOutputStream();
//		PrintWriter out=response.getWriter();
//		out.print("<h1>name is..."+name+"</h1>");
	
		if(name.equals("aliza")) {
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.html");
			rd.forward(request, response);
//			response.sendRedirect("Welcome.html");
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("register.html");
			rd.forward(request, response);
//			response.sendRedirect("register.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
