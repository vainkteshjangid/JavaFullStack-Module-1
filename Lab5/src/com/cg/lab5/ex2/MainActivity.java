package com.cg.lab5.ex2;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n=s.nextInt();
		int res1,res2;
		MyServices service=new MyServices();
		res1=service.fibonacciWithRecursion(n);
		res2=service.fibonacceWithoutRecursion(n);
		System.out.println("With recursion:"+res1);
		System.out.println("Without recursion:"+res2);
	}

}
