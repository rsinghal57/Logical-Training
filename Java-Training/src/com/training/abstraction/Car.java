package com.training.abstraction;

public class Car extends Vehicle {

	void tyres() {
		System.out.println("Car has 4 tyres");
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.tyres();
		c1.runningStatus();
//		Vehicle v1=new Vehicle() {
//			
//			@Override
//			void tyres() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
	}
}
