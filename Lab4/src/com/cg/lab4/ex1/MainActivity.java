package com.cg.lab4.ex1;
import java.util.Scanner;

import com.cg.services.MyServices;
public class MainActivity {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number:");
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		MyServices service=new MyServices();
		
		int result=service.sumOfCubesOfDigits(n);
		System.out.println("Sum of cubes of digit of "+n+" is:"+result);

	}

}
