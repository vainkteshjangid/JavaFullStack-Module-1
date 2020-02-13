package com.cg.lab7.ex3;

import java.util.HashMap;

import com.cg.lab7.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		int arr[]= {5,6,3,12,7,6,25,14};
		MyServices service=new MyServices();
		HashMap<Integer,Integer> squaresMap=service.squareOfNumbers(arr);
		System.out.println(squaresMap);

	}

}
