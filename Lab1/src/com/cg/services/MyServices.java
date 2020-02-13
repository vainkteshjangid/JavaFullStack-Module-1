package com.cg.services;

public class MyServices {
	public int calculateSum(int n) {

		int count=0,i=1,total=0;
		while(count<n) {
			if(i%3==0||i%5==0) {
				total=total+i;
				count++;
			}
			i++;
		}
		return total;
	}
	
	public int calculateDifference(int n)
	{
		int sumOfTheSquares=0,SquareOfSum,sum=0;
		for(int i=1;i<=n;i++)
		{
			sumOfTheSquares+=i*i;
			sum+=i;
		}
		
		SquareOfSum=sum*sum;
		
		return Math.abs(SquareOfSum-sumOfTheSquares);
		
	}
	
	public boolean isNumberIncreasing(int n) {
		int min=n%10;
		while(n>0)
		{
			if(n%10>min)
				return false;
			else {
				n=n/10;
				if(n%10<min) {
					min=n%10;
				}
			}
		}
		return true;
	}
	
	public boolean isPowerOfTwo(int n){
		while(n>=2)
		{
			if(n%2!=0)
				return false;
			else {
				n=n/2;
			}
		}
		return true;
	}

}
