package com.training.logical;

import java.util.Scanner;

public class Average {

	public static double getAverage(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum / arr.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("the Average is: " + getAverage(arr));
		sc.close();

	}

}
