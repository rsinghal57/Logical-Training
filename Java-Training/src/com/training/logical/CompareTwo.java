package com.training.logical;

import java.util.Scanner;

public class CompareTwo {
	
	public static boolean compareTwo(int a, int b) {
        if (a == b)
            return true;

        else if (a >= b - (0.1 * b) && a <= b + (0.1 * b))
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(compareTwo(a, b));
        sc.close();
        
    }

}
