package com.app.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	//method to return hello world
	//@GetMapping(path = "/hello-world")
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "hello world";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		HelloWorldBean helloWorldBean = HelloWorldBean.builder().message("hello world").build();
		return helloWorldBean;
		//throw new RuntimeException("some error");
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		
		HelloWorldBean helloWorldBean = HelloWorldBean.builder().message(String.format("hello world, %s",name)).build();
		return helloWorldBean;
	}
}
