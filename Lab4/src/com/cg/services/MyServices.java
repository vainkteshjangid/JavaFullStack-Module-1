package com.cg.services;

public class MyServices {
	public int sumOfCubesOfDigits(int n) {
		int d,sum=0;
		while(n>0) {
			d=n%10;
			sum+=Math.pow(d,3);
			n=n/10;
		}
		return sum;
	}

}
