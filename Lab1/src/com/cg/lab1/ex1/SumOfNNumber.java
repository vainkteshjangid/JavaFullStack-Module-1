package com.cg.lab1.ex1;

import java.util.Scanner;

import com.cg.services.MyServices;

public class SumOfNNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum;
		Scanner s=new Scanner(System.in);
		MyServices service=new MyServices();
		System.out.print("Enter n : ");
		n=s.nextInt();
		sum=service.calculateSum(n);
		System.out.println("Sum of first "+n+" numbers divisible by 3 or 5 is:"+sum);
	}
	

}
