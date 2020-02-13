package com.cg.lab5.ex3;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter a number:");
		n=s.nextInt();
		MyServices service=new MyServices();
		service.printAllPrimesBeforeN(n);
	}

}
