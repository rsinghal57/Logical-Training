package com.training.oop;

// Immutable Class
/**
 * 
 * @author rohit.singhal <br>
 *         This is an Immutable class and it is thread safe also.
 */
public final class Employee {
	private final String name;
	private final int empId;
	private final String department;

	Employee(String name, int empId, String department) {
		this.name = name;
		this.empId = empId;
		this.department = department;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.empId;
	}

	public String getDepartment() {
		return this.department;
	}

}
