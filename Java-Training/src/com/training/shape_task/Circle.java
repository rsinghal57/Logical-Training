package com.training.shape_task;

public class Circle implements Shape {
	String name;
	double radius;
	static double pi = 3.14;

	Circle(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getArea() {
		return radius * radius * pi;
	}

}
