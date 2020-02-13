package com.cpg.lab10.exercise1;

public class PowerClass {
	public static void main(String ar[])
	{
		LambdaPower lp=(num1,num2)->{double result= Math.pow(num1,num2);
		return (int) result;};
	
		int result = lp.powerxy(10, 3);
		System.out.println(result);
	}

}
