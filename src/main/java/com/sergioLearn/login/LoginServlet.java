package com.sergioLearn.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sergioLearn.todo.TodoService;


@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{

	private LoginService userValidationService = new LoginService();
	private TodoService todoService = new TodoService();
	
	
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
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean isUserValid = userValidationService.isUserValid(name, password);
		
		if(isUserValid) {
		
			//list-todo.do
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/list-todo.do");
			/*request.setAttribute("name", name);
			 
			request.setAttribute("todos", todoService.retrieveTodos());
			
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);*/
		}else {
			request.setAttribute("errorMessage", "Invalid Credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}
	
}
