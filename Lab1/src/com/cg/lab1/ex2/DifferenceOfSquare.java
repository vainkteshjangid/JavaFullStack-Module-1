/*Problem : Create a class with a method to find the difference between the sum of the squares
and the square of the sum of the first n natural numbers.  */
package com.cg.lab1.ex2;

import java.util.Scanner;

import com.cg.services.MyServices;

public class DifferenceOfSquare {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter value of n:");
		n=s.nextInt();
		
		MyServices service=new MyServices();
		int result=service.calculateDifference(n);
		System.out.println(result);
	}

}
