package com.cg.services;

import java.io.File;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

public class MyServices {

	public int calculateTokenSum(String str) {
		int sum=0;
		StringTokenizer st=new StringTokenizer(str," ");
		ArrayList<Integer> arr=new ArrayList<>();
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
			sum+=arr.get(i);
		}
		return sum;
	}

	public StringBuffer getMirrorImage(StringBuffer sb) {
		
		return sb.reverse();
	}

	public StringBuffer removeConsonants(StringBuffer sb) {
		// TODO Auto-generated method stub
		StringBuffer res=new StringBuffer("");
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)=='a'|| sb.charAt(i)=='A'|| sb.charAt(i)=='e'|| sb.charAt(i)=='E'||
					sb.charAt(i)=='i'||sb.charAt(i)=='I'||sb.charAt(i)=='o'||sb.charAt(i)=='O'||
					sb.charAt(i)=='u'||sb.charAt(i)=='U') {
				res.append(sb.charAt(i));
				
			}
			else {
				char ch=sb.charAt(i);
				switch(ch) {
				case 'z':
					res.append('a');
					break;
				case 'Z':
					res.append('A');
					break;
				default:
					res.append(++ch);
					break;
				}
			}
		}
		return res;
	}

	public int modifyNumber(Integer num) {
		String str=num.toString();
		int len=str.length();
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<str.length()-1;++i) {
			sb.append(Math.abs((int)str.charAt(i+1)-(int)str.charAt(i)));
		}
		sb.append(str.charAt(str.length()-1));
		return Integer.parseInt(sb.toString());
	}

	public void getFileDetails(String filename) {
		// TODO Auto-generated method stub
		File file=new File(filename);
		if(file.exists()) {
			System.out.println("File Exists!");
			System.out.println("File extension: "+getFileExtension(file));
			System.out.println("Is file readable: "+file.canRead());
			System.out.println("Is file writable: "+file.canWrite());
		}
		else {
			System.out.println("File does not exists!");
		}
		
	}
	
	public String getFileExtension(File file) {
		String name=file.getName();
		int dotIndex=name.lastIndexOf('.');
		if(dotIndex!=-1 && dotIndex!=0) {
			return name.substring(dotIndex+1);
		}
		return "";
	}

	public boolean isStringIncreasing(String str) {
		// TODO Auto-generated method stub
		char[] arr=new char[str.length()];
		arr=str.toCharArray();
		if(arr.length==1)
			return true;
		for(int i=1;i<arr.length;i++) {
			if((int)arr[i]<(int)arr[i-1])
			return false;
		}
		return true;
	}

	public void getDurationOfDate(String date) {
		// TODO Auto-generated method stub
		Date curDate=new Date();
		try {
			Date d=new SimpleDateFormat("dd/mm/yyyy").parse(date);
			System.out.println("Duration in days:"+Math.abs(curDate.getDate()-d.getDate()));
			System.out.println("Duration in Months:"+Math.abs(curDate.getMonth()-d.getMonth()));
			System.out.println("Duration in years:"+Math.abs(curDate.getYear()-d.getYear()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean validateUsername(String username) {
		// TODO Auto-generated method stub
		if(username.length()<12)
			return false;
		String suffix=new String();
		suffix="_job";
		if(username.substring(username.length()-4).equals(suffix))
			return true;
		else
		return false;
	}
	
	
}
