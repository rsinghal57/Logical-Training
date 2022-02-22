package com.training.oop;

public class EmailValidation {

	public boolean isEmailValid(String email) {
		if (email.contains("@"))
			return true;
		else
			return false;

	}

}
