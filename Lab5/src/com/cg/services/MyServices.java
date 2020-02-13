package com.cg.services;
import java.util.Scanner;

import com.cg.exception.InvalidAgeException;
import com.cg.exception.InvalidNameException;
import com.cg.exception.InvalidSalaryException;
import com.cg.exception.InvalidSignalException;

public class MyServices {
	
	

	public String trafficSingal(char n) {
		
		
		String msg="";
		
		try {
			
			if(n=='1') {
				msg="STOP";
			}
			else if(n=='2') {
				msg="READY";
			}
			else if(n=='3') {
				msg="GO";
			}
			else {
				throw new InvalidSignalException();
			}
		
		}catch(InvalidSignalException e) {
				e.printStackTrace();
			}
		return msg;
	}

	public void validateName(String firstname, String lastname) {
		try {
			if(firstname.isEmpty()||lastname.isEmpty()) {
				throw new InvalidNameException();
			}
			else {
				System.out.println("Welcome! "+firstname+" "+lastname);
			}
		}catch(InvalidNameException e) {
			e.printStackTrace();
		}
		
	}

	public void validateAge(int age) {
		try {
			if(age<=15) {
				throw new InvalidAgeException();
			}
			else {
				System.out.println("You are allowed to watch it.");
			}
		}catch(InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}

	public void checkSalary(int salary) {
		try {
			if(salary<3000) {
				throw new InvalidSalaryException("Salary should not be less than 3000");
			}
			else {
				System.out.println("Congrats! your salary is more than 3000.");
			}
		}catch(InvalidSalaryException e) {
			System.out.println(e);
		}
		
		
	}

	public int fibonacciWithRecursion(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		else
			return fibonacciWithRecursion(n-1)+fibonacciWithRecursion(n-2);
	}

	public int fibonacceWithoutRecursion(int n) {
		int arr[]=new int[n];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n-1];
	}

	public void printAllPrimesBeforeN(int n) {
		System.out.print("Prime numbers:");
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
	}

	public boolean isPrime(int num) {
		for(int j=2;j<num;j++) {
			if(num%j==0) {
				return false;
			}
		}
		return true;
	}

}
