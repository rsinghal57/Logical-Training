package com.training.shape_task;

public class Rectangle implements Shape {
//	private static final Logger logger = LogManager.getLogger(Rectangle.class);

	String name;
	double length;
	double breadth;

	public Rectangle(String name, double length, double breadth) {
		this.name = name;
		this.length = length;
		this.breadth = breadth;
//		logger.info("A rectangle object is created");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getArea() {
		return length * breadth;
	}

}
