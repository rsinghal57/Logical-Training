package com.training.logical;

import java.util.Scanner;

public class DigitSum {
	
	public static int sumDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
	
	public static int sumDigitsR(int n)
	{
		if(n==0)
			return 0;
		return n%10+sumDigitsR(n/10);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the sum of digits using loops is: "+sumDigits(n));
        System.out.println("the sum of digits using recursion is: "+sumDigitsR(n));
        sc.close();

	}

}
