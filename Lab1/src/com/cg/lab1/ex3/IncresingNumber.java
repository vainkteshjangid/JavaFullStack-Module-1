package com.cg.lab1.ex3;

import java.util.Scanner;

import com.cg.services.MyServices;

public class IncresingNumber {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number to check if it's increasing: ");
		n=s.nextInt();
		MyServices service=new MyServices();
		
		boolean result=service.isNumberIncreasing(n);
		System.out.println(result);

	}

}
