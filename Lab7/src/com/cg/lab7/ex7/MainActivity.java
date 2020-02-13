package com.cg.lab7.ex7;

import java.util.Scanner;

import com.cg.lab7.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		int size;
		Scanner s=new Scanner(System.in);
		System.out.print("Size of array:");
		size=s.nextInt();
		arr=new int[size];
		System.out.print("Enter elements of the array:");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		
		MyServices service=new MyServices();
		int []res=service.getSorted(arr);
		for(Integer i:res) {
			System.out.println(i);
		}
	}

}
