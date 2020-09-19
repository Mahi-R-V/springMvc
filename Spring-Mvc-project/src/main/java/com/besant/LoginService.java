package com.besant;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("besant") && password.equals("besant");
	}

}