package com.cg.lab6.ex3;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		String st=s.nextLine();
		sb.append(st);
		MyServices service=new MyServices();
		StringBuffer result=new StringBuffer("");
		result.append(sb);
		result.append(" | ");
		result.append(sb.reverse());
		System.out.println(result);  

	}

}
