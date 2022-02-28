package com.training.shape_task;

public class Square implements Shape {
//	private static final Logger logger = LogManager.getLogger(Square.class);

	String name;
	double side;

	public Square(String name, double side) {
		this.name = name;
		this.side = side;
//		logger.info("A square object is created");
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
