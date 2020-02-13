package com.cg.lab7.ex6;

import java.util.HashMap;
import java.util.List;

import com.cg.lab7.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> empList=new HashMap<Integer,Integer>();
		empList.put(11, 26);
		empList.put(12, 31);
		empList.put(13, 17);
		empList.put(14, 16);
		empList.put(15, 18);
		empList.put(16, 43);
		
		MyServices service=new MyServices();
		List<Integer> voterList=service.votersList(empList);
		System.out.println("Voter IDs of eligible voters:"+voterList);
	}

}
