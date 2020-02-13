package com.cg.lab6.ex5;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		Integer num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		num=s.nextInt();
		MyServices service=new MyServices();
		
		int result=service.modifyNumber(num);
		System.out.println("Modified number:"+result);

	}

}
