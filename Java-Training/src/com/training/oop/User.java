package com.training.oop;

public class User {
	private String name;
	private String email;

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		EmailValidation ev = new EmailValidation();
		if (ev.isEmailValid(email)) {
			this.email = email;
			System.out.println("email set successfully");
		} else {
			System.out.println("Please enter correct form of email");
		}
	}

}
