package com.cg.lab3.ex3;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[],n;
		System.out.println("Size of array:");
		n=s.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		MyServices service=new MyServices();
		service.reverseNumbersSortArray(arr);
	}

}
