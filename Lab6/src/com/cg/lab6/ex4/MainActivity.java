package com.cg.lab6.ex4;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		String st=s.nextLine();
		StringBuffer sb=new StringBuffer(st);
		MyServices service=new MyServices();
		StringBuffer result=service.removeConsonants(sb);
		System.out.println(result);

	}

}
