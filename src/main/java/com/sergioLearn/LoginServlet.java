package com.sergioLearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PrintWriter writer = response.getWriter();
//		writer.println("Dummy Stuff");
//		writer.println("Dummy Stuff2");
		
		/*
		 * We can get any params from the http request
		 * putting in the URL the params separated by '?' format example: '?param=value'
		 * also we can pass params to the jsp file adding content to the request
		 * */
		
		request.setAttribute("name", "Sergio");
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("name", request.getAttribute("name"));
		
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		
	}
	
}
