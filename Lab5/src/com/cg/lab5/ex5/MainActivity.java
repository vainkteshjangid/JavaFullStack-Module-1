package com.cg.lab5.ex5;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age:");
		age=s.nextInt();
		MyServices service=new MyServices();
		service.validateAge(age); 
	}

}
