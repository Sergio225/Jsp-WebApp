package com.sergioLearn.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	
	 /*
	  * Static block that is a set of instructions that is run only once when a class is loaded into memory. (static initialization block)
	  * */
	static {
		todos.add(new Todo("Learn Web Application Development", "Study"));
		todos.add(new Todo("Learn Spring MVC", "Study"));
		todos.add(new Todo("Learn Spring Rest Services", "Study"));
	}
	
	public List<Todo> retrieveTodos(){
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
	
}
