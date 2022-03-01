package com.training.employee_task;

import java.io.Serializable;

public class PersonalDetails implements Serializable {
	public String name;
	public int empId;
	public String email;
	public Address address;

	public PersonalDetails(String name, int empId, String email, Address address) {
		this.name = name;
		this.empId = empId;
		this.email = email;
		this.address = address;
	}

	public void printPersonalDetails() {
		System.out.println("The details are:");
		System.out.println("name: " + this.name);
		System.out.println("employee ID: " + this.empId);
		System.out.println("email: " + this.email);
		this.address.printAdress();
	}

}
