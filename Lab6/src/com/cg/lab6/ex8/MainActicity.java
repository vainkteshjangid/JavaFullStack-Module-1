package com.cg.lab6.ex8;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActicity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter a String to check if it's increasing:");
		str=s.next();
		MyServices service=new MyServices();
		
		boolean res=service.isStringIncreasing(str);
		if(res) {
			System.out.println("Yes! it is increasing.");
		}
		else {
			System.out.println("No! your string is not increasing.");
		}
	}

}
