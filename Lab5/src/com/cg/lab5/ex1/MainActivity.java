package com.cg.lab5.ex1;
import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		
		
		char n;
		Scanner s=new Scanner(System.in);
		MyServices service=new MyServices();
		System.out.println("Traffic signals : 1.Red  2.Yellow  3.Green");
		n=s.next().charAt(0);
		String msg=service.trafficSingal(n);
		System.out.println(msg);
		
	}

}
