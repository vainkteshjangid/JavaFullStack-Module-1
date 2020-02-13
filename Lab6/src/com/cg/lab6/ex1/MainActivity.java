package com.cg.lab6.ex1;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {
	//
	public static void main(String args[]) {
		
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number string:");
		str=s.nextLine();
		
		MyServices service=new MyServices();
		int result=service.calculateTokenSum(str);
		System.out.println("Sum = "+result); 
	}

}
