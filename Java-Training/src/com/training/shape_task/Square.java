package com.training.shape_task;

public class Square implements Shape {
	String name;
	double side;

	public Square(String name, double side) {
		this.name = name;
		this.side = side;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getArea() {
		return (side * side);
	}

}
