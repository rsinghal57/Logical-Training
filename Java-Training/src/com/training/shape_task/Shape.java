package com.training.shape_task;

public interface Shape {

	public double getArea();

	public String getName();

	default void printArea() {
		System.out.println("The area is: " + getArea());
	}

}
