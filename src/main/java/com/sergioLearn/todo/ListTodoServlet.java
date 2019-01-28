package com.sergioLearn.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sergioLearn.todo.TodoService;


@WebServlet(urlPatterns = "/list-todo.do")
public class ListTodoServlet extends HttpServlet{

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
		request.setAttribute("todos", todoService.retrieveTodos());
		
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
		
	}
	
}
