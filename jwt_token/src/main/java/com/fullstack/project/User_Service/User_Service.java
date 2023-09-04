package com.fullstack.project.User_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fullstack.project.User_Repository.User_Repository;
import com.fullstack.project.entity.Signupdata;
import com.fullstack.project.entity.User;
import com.fullstack.project.jsonwebtoken.Jwebtoken;

@Service
public class User_Service {
	
	@Autowired
	 User_Repository user_repo;
	
	@Autowired
	private Jwebtoken jwebtok;
	
	
	public User Signup(User user) {
		
		User u=new User();
		u.setEmail_id(user.getEmail_id());
		u.setGender(user.getGender());
		u.setUsername(user.getUsername());
		u.setPassword(user.getPassword());
		u.setPhone_number(user.getPhone_number());
	
		
	user_repo.save(u);
		
		return u;
	}


	public ResponseEntity<String> Logincheck(User sign) {
	User u=	user_repo.findByPasswordAndUsername(sign.getPassword(),sign.getUsername());
	
	if(u==null) {
		return new ResponseEntity<String>("not successfull",HttpStatus.BAD_REQUEST);
	}
	else {
	String token=jwebtok.jwtoken(u);
	//System.out.println(token);
	return new ResponseEntity<String>(token,HttpStatus.OK);
	
	}

	}

		
	



	
}
