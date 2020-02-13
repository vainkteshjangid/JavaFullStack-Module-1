package com.cg.lab7.ex2;

import java.util.HashMap;

import com.cg.lab7.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		char arr[]= {'a','g','a','e','g','e','h','b','w'};
		MyServices service=new MyServices();
		HashMap<Character,Integer> charFrequency=service.calculateFrequency(arr);
		System.out.println(charFrequency);
		}

}
