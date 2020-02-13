package com.cg.lab6.ex9;

import java.sql.Date;
import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any date(dd/mm/yyyy):");
		String date=s.next();
		MyServices service=new MyServices();
		service.getDurationOfDate(date);
	}

}
