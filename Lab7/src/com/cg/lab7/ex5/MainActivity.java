package com.cg.lab7.ex5;

import java.util.Scanner;

import com.cg.lab7.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter array size:");
		int n=s.nextInt();
		System.out.println("Enter elements of the array:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		MyServices service=new MyServices();
		int secondSmallestNum=service.getSecondSmallest(arr);
		System.out.println(secondSmallestNum);
	}

}
