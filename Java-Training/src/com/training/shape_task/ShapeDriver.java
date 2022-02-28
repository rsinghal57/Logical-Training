package com.training.shape_task;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeDriver {

	private static Logger logger = LogManager.getLogger(ShapeDriver.class);

	public static void main(String[] args) throws Exception {
//		System.setProperty("log4j.configurationFile", "resources/log4j2.properties");
		Scanner sc = new Scanner(System.in);
		logger.info("Hello logger working");
		HashMap<String, Shape> map = new HashMap<>();
		int n;
		while (true) {
			System.out.println("Enter number of shapes you want to enter");
			try {
				n = sc.nextInt();
				if (n <= 0 || n > 100) {
					throw new Exception("Enter number between 1 to 100");
				}
				break;
			} catch (InputMismatchException e) {
				String badInput = sc.next();
				System.out.println(e);
				continue;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Choose the type of shape:");
			System.out.println("1:Circle  2:Square  3:Rectangle");
			String choice = sc.next();
			Shape s1 = null;
			if (choice.equals("1")) {
				System.out.println("Enter circle name");
				String name = sc.next();
				System.out.println("Enter radius");
				double radius = sc.nextDouble();
				s1 = new Circle(name, radius);
				logger.info("Circle class object is created");
			} else if (choice.equals("2")) {
				System.out.println("Enter square name");
				String name = sc.next();
				System.out.println("Enter side");
				double side = sc.nextDouble();
				s1 = new Square(name, side);
				logger.info("Sqaure class object is created");

			} else if (choice.equals("3")) {
				System.out.println("Enter rectangle name");
				String name = sc.next();
				System.out.println("Enter length");
				double length = sc.nextDouble();
				System.out.println("Enter breadth");
				double breadth = sc.nextDouble();
				s1 = new Rectangle(name, length, breadth);
				logger.info("Rectangle class object is created");

			} else {
				System.out.println("Invalid input");
				logger.warn("Invalid choice");
				i--;
				continue;
			}
			if (s1 != null) {
				map.put(s1.getName(), s1);
			}

		}
		System.out.println("Enter the name of the shape you want to calculate area of.");
		String name = sc.next();
		if (!map.containsKey(name)) {
			System.out.println("Shape not found");
			logger.error("Shape not found in map");
		} else {
			Shape s1 = map.get(name);
			s1.printArea();
		}

//		System.out.println("The area of " + name + " is: " + s1.getArea());

	}

}
