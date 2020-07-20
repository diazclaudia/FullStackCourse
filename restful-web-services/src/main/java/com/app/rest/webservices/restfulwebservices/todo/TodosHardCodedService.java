package com.app.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.*;

@Data
@Builder
@Service
public class TodosHardCodedService {
	private static List<Todo> todos = new ArrayList();
	private static long idCounter = 0;
	
	static {
		todos.add(Todo.builder()
								.id(++idCounter)
								.username("admin")
								.description("learn to dance")
								.targetDate(new Date())
								.isDone(false)
								.build());
		
		todos.add(Todo.builder()
								.id(++idCounter)
								.username("admin")
								.description("learn about spring")
								.targetDate(new Date())
								.isDone(false)
								.build());
		
		todos.add(Todo.builder()
								.id(++idCounter)
								.username("admin")
								.description("learn about angular")
								.targetDate(new Date())
								.isDone(false)
								.build());
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		
		if(todo == null) {
			return null;
		}
		
		if(todos.remove(todo)) {
			return todo;
		}
		
		return null;
		
	}

	public Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}
		else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	
}
