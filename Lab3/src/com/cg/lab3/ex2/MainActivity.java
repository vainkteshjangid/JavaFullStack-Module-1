package com.cg.lab3.ex2;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str[];
		int n;
		System.out.print("Enter size of array:");
		n=s.nextInt();
		str=new String[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			str[i]=s.next();
		}
		MyServices service=new MyServices();
		service.sortStringsAlphabetically(str);

	}

}
