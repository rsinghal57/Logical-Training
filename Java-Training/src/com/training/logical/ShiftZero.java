package com.training.logical;

import java.util.Scanner;

/**
 * 
 * @author rohit.singhal
 *   <br>
 *   This class shifts all the zeroes at the end.
 */
public class ShiftZero {
	
	public static void shift(int[] arr) {
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != 0 && i == j) {
                i++;
                j++;
            } else if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            } else {
                i++;
            }
        }
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        shift(arr);
        System.out.println("After Shifting:");
        for (int i : arr)
            System.out.println(i);
        
        sc.close();

    }


}
