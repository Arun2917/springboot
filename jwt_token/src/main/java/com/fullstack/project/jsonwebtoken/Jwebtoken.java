package com.fullstack.project.jsonwebtoken;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fullstack.project.entity.User;

import io.jsonwebtoken.Claims;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class Jwebtoken {


	
	private static String secret="this is secret";
	public String jwtoken(User user) {
		Date issuedAt=new Date();
		
		Claims claims=Jwts.claims()
				.setIssuer(user.getUsername())
				.setSubject(secret)
				.setIssuedAt(issuedAt);
		String jwt=Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512,secret).compact();
		
		return jwt;
		
	}
}
