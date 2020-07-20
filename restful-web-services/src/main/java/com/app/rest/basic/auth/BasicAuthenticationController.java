package com.app.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/basicauth")
	public AuthenticationBean helloWorldBean() {		
		AuthenticationBean authenticationBean = AuthenticationBean.builder().message("you are authenticated").build();
		return authenticationBean;
	}
	
}
