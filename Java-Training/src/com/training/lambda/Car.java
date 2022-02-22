package com.training.lambda;

public class Car {

	public static void main(String args[]) {
		Vehicle v1 = () -> System.out.println("Car has 4 tyres");
		v1.tyres();

	}

}
