package com.training.functional_Interfaces;

import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
		Consumer<Integer> display = a -> System.out.println(a);
		display.accept(10);
	}

}
