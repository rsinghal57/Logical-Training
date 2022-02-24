package com.training.shape_task;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Shape> map = new HashMap<>();
		int n;
		while (true) {
			System.out.println("Enter number of shapes you want to enter");
			try {
				n = sc.nextInt();
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
			} else if (choice.equals("2")) {
				System.out.println("Enter square name");
				String name = sc.next();
				System.out.println("Enter side");
				double side = sc.nextDouble();
				s1 = new Square(name, side);

			} else if (choice.equals("3")) {
				System.out.println("Enter rectangle name");
				String name = sc.next();
				System.out.println("Enter length");
				double length = sc.nextDouble();
				System.out.println("Enter breadth");
				double breadth = sc.nextDouble();
				s1 = new Rectangle(name, length, breadth);

			} else {
				System.out.println("Invalid input");
				i--;
				continue;
			}
			if (s1 != null) {
				map.put(s1.getName(), s1);
			}

		}
		System.out.println("Enter the name of the shape you want to calculate area of.");
		String name = sc.next();
		Shape s1 = map.get(name);
		s1.printArea();
//		System.out.println("The area of " + name + " is: " + s1.getArea());

	}

}
