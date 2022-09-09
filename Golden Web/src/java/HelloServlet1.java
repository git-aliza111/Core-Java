package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet1
 */
@WebServlet("/HelloServlet1")
public class HelloServlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
//		String name=request.getParameter("name");
//		System.out.println("do get called...."+name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("number");
//		ServletOutputStream out=response.getOutputStream();
//		System.out.println("do post called "+ num);
		int n=Integer.parseInt(num);
		if(n%2==0) {
		response.sendRedirect("even.html");
		}
		else {
//		response.sendRedirect("odd.html");
			RequestDispatcher rd=request.getRequestDispatcher("odd.html");
			rd.forward(request, response);
		}
	}

}
