package com.cg.lab7.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyServices {

	public List<Integer> getSortedValues(HashMap<Integer, Integer> hm) {
		List<Integer> list=new LinkedList<Integer>(hm.values());
		Collections.sort(list);
		return list;
	}

	public HashMap calculateFrequency(char[] arr) {
		HashMap<Character,Integer> freq=new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(freq.containsKey(arr[i])) {
				freq.put(arr[i],freq.get(arr[i])+1);
			}
			else {
				freq.put(arr[i], 1);
			}
			
		}
		return freq;
	}

	public HashMap<Integer, Integer> squareOfNumbers(int[] arr) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], arr[i]*arr[i]);
		}
		return map;
	}

	public void calculateGrades(HashMap<String, Integer> marks) {
		Iterator itr=marks.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> mapEntry=(Map.Entry<String, Integer>)itr.next();
			int ch=mapEntry.getValue();
			if(ch>=90) {
				System.out.println(mapEntry.getKey()+" "+mapEntry.getValue()+" "+"Gold");
			}
			else if(ch>=80 && ch<90) {
				System.out.println(mapEntry.getKey()+" "+mapEntry.getValue()+" "+"Silver");
			}
			else if(ch>=70 && ch<80) {
				System.out.println(mapEntry.getKey()+" "+mapEntry.getValue()+" "+"Bronze");
			}
		}
		
	}

	public int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		return arr[1];
	}

	public List<Integer> votersList(HashMap<Integer, Integer> empList) {
		List<Integer> res=new ArrayList<Integer>();
		Set<Map.Entry<Integer, Integer>> entries=empList.entrySet();
		for(Entry<Integer, Integer> itr:entries) {
			if(itr.getValue()>18) {
				res.add(itr.getKey());
			}
		}
		return res;
	}

	public int[] getSorted(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int rev=0,d;
			while(arr[i]>0) {
				d=arr[i]%10;
				rev=rev*10+d;
				arr[i]=arr[i]/10;
			}
			arr[i]=rev;
		}
		Arrays.sort(arr);
		return arr;
	}

	public int[] modifyArray(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> s=new LinkedHashSet<Integer>();
		
		return null;
	}

}
