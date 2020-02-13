package com.cg.lab5.ex6;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary:");
		salary=s.nextInt();
		MyServices service=new MyServices();
		service.checkSalary(salary);

	}

}
