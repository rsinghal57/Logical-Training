package com.training.logical;

import java.util.Scanner;

public class Pattern {
	
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for (int i = 1; i <= n; i++) {
	            String str = "";
	            for (int j = 0; j < i; j++) {
	                str += "0";
	            }
	            for (int j = 0; j < i; j++) {
	                str += "1";
	            }
	            System.out.print(str + " ");
	        }
	        sc.close();
	    }

}
