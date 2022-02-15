package com.training.logical;

import java.util.Scanner;

public class ReverseString {
	
	public static void stringReverse(char[] arr)
	{
		String str="";
		for(int i=arr.length-1;i>=0;i--)
		{
			str+=arr[i];
		}
		System.out.println("reversed string using loop: "+str);
	}
	
	public static String stringReverseR(char[] arr,int ind)
	{
		if(ind<0)
			return "";
		String str=""+arr[ind];
		return str+stringReverseR(arr, ind-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char arr[]=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		stringReverse(arr);
		System.out.println("reversed string ysung recursion: "+stringReverseR(arr, n-1));
		sc.close();
	}

}
