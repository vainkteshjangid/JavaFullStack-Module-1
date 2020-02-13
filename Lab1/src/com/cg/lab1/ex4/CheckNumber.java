package com.cg.lab1.ex4;

//Problem: WAP to check if a number is power of 2.

import java.util.Scanner;

import com.cg.services.MyServices;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter a number:");
		n=s.nextInt();
		MyServices service=new MyServices();
		boolean result=service.isPowerOfTwo(n);
		
		System.out.println(result);
	}

}
