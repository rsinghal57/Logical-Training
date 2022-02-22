package com.training.oop;

import java.util.HashMap;
import java.util.Scanner;

public class CircleDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many circles you want to store?");
		int n = sc.nextInt();
		HashMap<String, Circle> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter circle name");
			String name = sc.next();
			System.out.println("Enter radius");
			int radius = sc.nextInt();
			System.out.println("Enter the circle color");
			String color = sc.next();
			Circle c1 = new Circle(name, radius, color);
			map.put(name, c1);
		}
		System.out.println("Enter the circle name you want to calculate address of.");
		String name = sc.next();
		if (!map.containsKey(name)) {
			System.out.println("Circle does not exist");
		} else {
			Circle c1 = map.get(name);
			int radius = c1.radius;
			System.out.println(
					"The area of circle " + name + "is: " + 3.14 * radius * radius + " and color is: " + c1.color);
		}

	}

}
