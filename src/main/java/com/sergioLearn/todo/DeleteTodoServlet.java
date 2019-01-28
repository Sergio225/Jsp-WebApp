package com.sergioLearn.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sergioLearn.todo.TodoService;


@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet{

	private TodoService todoService = new TodoService();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		todoService.deleteTodo(new Todo(request.getParameter("todo"), request.getParameter("category")));
		response.sendRedirect("/list-todo.do");
		
	}
	
}
