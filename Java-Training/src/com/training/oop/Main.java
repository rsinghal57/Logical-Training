package com.training.oop;

public class Main {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("Rohit");
		u1.setEmail("efefew32");
		System.out.println(u1.getName());
		System.out.println(u1.getEmail());

		// Singleton Class
		SingletonExample s1 = SingletonExample.getInstance();
		SingletonExample s2 = SingletonExample.getInstance();
		SingletonExample s3 = SingletonExample.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
//		SingletonExample s4 = new SingletonExample();
		s1.setUid(1);
//		SingletonExample s5 = new SingletonExample();
		s2.setUid(2);

	}

}
