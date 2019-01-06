package com.example.newostore.model;

import org.springframework.data.annotation.Id;

public class User {
	@Id
	
	private Integer id;	
	
	private String username;
	
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	//  constructor
	public User() {
		super();
	}
	public User(int id, String username, String email, String password, String firstname, String lastname) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	// all getter and setter
	
	public int getId() {
		return id;
	}	

	public void setId(int id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	
	
}