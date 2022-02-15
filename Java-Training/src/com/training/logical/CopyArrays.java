package com.training.logical;

import java.util.Scanner;

public class CopyArrays {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        char[] arr = new char[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.next().charAt(0);
	        }
	        int[] nums = new int[n];
	        char[] special = new char[n];
	        int numsCounter = 0;
	        int specialCounter = 0;
	        for (char c : arr) {
	            if (c >= '0' && c <= '9') {
	                nums[numsCounter++] = Character.getNumericValue(c);
	            } else if (c >= 32 && c <= 47) {
	                special[specialCounter++] = c;
	            }

	        }
	        System.out.println("The number array is: ");
	        for (int i = 0; i < numsCounter; i++)
	            System.out.print(nums[i] + " ");

	        System.out.println();

	        System.out.println("The special character array is: ");
	        for (int i = 0; i < specialCounter; i++)
	            System.out.print(special[i] + " ");
	        
	        sc.close();

	    }

}
