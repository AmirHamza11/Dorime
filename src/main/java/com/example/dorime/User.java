package com.example.dorime;

public class User {
	private int user_id;
	private String username;
	private String email;
	private String password;
	private int user_type;
	
	public User(int user_id, String username, String email, String password, int user_type) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.user_type = user_type;
	}

	public int getUser_id() {
		return user_id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public int getUser_type() {
		return user_type;
	}
	
	
	
	

}
