package com.cg.lab7.ex1;
import com.cg.lab7.services.MyServices;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class MainActivity {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(1,3000);
		hm.put(2, 5200);
		hm.put(3, 1321);
		hm.put(4,8542);
		hm.put(5, 5632);
		
		MyServices service=new MyServices();
		List<Integer> tm=service.getSortedValues(hm);
		System.out.println(tm);
	}

}
