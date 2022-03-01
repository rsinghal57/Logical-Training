package com.serial;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int uid;
	transient int x;

	public Student(String name, int uid) {
		this.name = name;
		this.uid = uid;
	}

	public void display() {
		System.out.println(name + " " + uid);
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}

}
