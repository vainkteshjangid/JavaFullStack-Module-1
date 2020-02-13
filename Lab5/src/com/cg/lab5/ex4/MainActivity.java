package com.cg.lab5.ex4;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {
	public static void main(String[] args) {
		String firstname,lastname;
		Scanner s=new Scanner(System.in);
		System.out.println("Firstname:");
		firstname=s.nextLine();
		System.out.println("Lastname:");
		lastname=s.nextLine();
		MyServices service=new MyServices();
		service.validateName(firstname,lastname); 
	}

}
