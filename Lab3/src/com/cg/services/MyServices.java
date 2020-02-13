package com.cg.services;

import java.util.Arrays;

public class MyServices {

	public int getSecondSmallest(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}
	
	public void sortStringsAlphabetically(String str[]) {
		Arrays.sort(str);
		int len=str.length;
		if(len%2==0)
		{
			for(int i=0;i<len/2;++i) {
				str[i]=str[i].toLowerCase();
			}
			for(int i=len/2;i<len;++i) {
				str[i]=str[i].toUpperCase();
			}
		}
		else {
			for(int i=0;i<=len/2;++i) {
				str[i]=str[i].toLowerCase();
			}
			for(int i=len/2+1;i<len;++i) {
				str[i]=str[i].toUpperCase();
			}
		}
		
		for(int i=0;i<len;i++) {
			System.out.print(str[i]+" ");
		}
	}
	
	
	public void reverseNumbersSortArray(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			arr[i]=reverseNumber(arr[i]);
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public int reverseNumber(int n) {
		int revNum=0,d;
		while(n>0) {
			d=n%10;
			revNum=(revNum*10)+d;
			n=n/10;
		}
		return revNum;
	}
	
	public void countChar(char[] arr) {
		int freq[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					freq[i]++;
					arr[j]='0';
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ' && arr[i]!='0') {
				System.out.println(arr[i]+" = "+(freq[i]+1));
			}
		}
	}
}
