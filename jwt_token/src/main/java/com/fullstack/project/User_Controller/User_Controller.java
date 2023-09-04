package com.fullstack.project.User_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.fullstack.project.User_Service.User_Service;
import com.fullstack.project.entity.Signupdata;
import com.fullstack.project.entity.User;

@Controller

public class User_Controller {

	
	@Autowired
	 User_Service user_service;
	
	@PostMapping("/index")
	public ResponseEntity<User> Signup(@RequestBody User user) {
		
		User n=user_service.Signup(user);
		return new ResponseEntity<>(n,HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody User signupdata) {
		
	ResponseEntity<String> a=	user_service.Logincheck(signupdata);
	
		return a;
	
	}
	
	


}
