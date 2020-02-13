package com.cg.lab3.ex1;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[],n;
		System.out.print("Enter size of array:");
		n=s.nextInt();
		arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		MyServices service=new MyServices();
		int result=service.getSecondSmallest(arr);
		System.out.println("Second smallest element is:"+result);

	}

}
