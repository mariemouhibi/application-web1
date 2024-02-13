package com.example.pfe.backend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class AuthUserDetails implements Serializable {

	@Autowired
	private static final long serialVersionUID = 4205231072802684310L;
	private String username;
	private String email;
	
	public AuthUserDetails() {
		// TODO Auto-generated constructor stub
	}

	public AuthUserDetails(String username,String email) {
		// TODO Auto-generated constructor stub
		this.username=username;
		this.email=email;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	


}
