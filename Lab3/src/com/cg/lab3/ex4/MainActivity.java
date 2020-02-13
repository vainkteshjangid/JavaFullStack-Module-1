package com.cg.lab3.ex4;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char arr[];int n;
		System.out.println("Size of char array:");
		n=s.nextInt();
		arr=new char[n];
		System.out.println("Enter elements in array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.next().charAt(0);
		}
		
		MyServices service=new MyServices();
		service.countChar(arr);
	}

}
