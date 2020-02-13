package com.cg.lab6.ex10;

import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String username;
		System.out.println("(Note:-There must be at least 8 chars in username.\nIt should"
				+ "contain _job)");
		System.out.println("Enter Username:");
		username=s.next();
		MyServices service=new MyServices();
		boolean res=service.validateUsername(username);
		if(res) {
			System.out.println("Welcome!You are allowed to access it.");
		}
		else
		{
			System.out.println("Invalid username!Try again.");
		}

	}

}
