package com.training.employee_task;

import java.io.Serializable;

public class Address implements Serializable {
	public String country;
	public String state;
	public String city;
	public String localAddress;
	public int pincode;

	public Address(String country, String state, String city, String localAddress, int pincode) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.localAddress = localAddress;
		this.pincode = pincode;
	}

	public void printAdress() {
		System.out.println("Address: " + localAddress + "," + this.city);
		System.out.println(this.state + "," + this.country);
		System.out.println("PIN Code: " + this.pincode);
	}

}
