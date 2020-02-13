package com.cpg.lab10.exercise5;



import java.util.function.Consumer;

public class Factorial {
	static int result = 1;
	public static int getfactorialresult(int num)
	{
		
		if(num==0)
			return result;
		
		return result=num*getfactorialresult(num=num-1);
	}
	public static void main(String ar[])
	{
		Factorial f=new Factorial();
		FactorialFunction consumer=Factorial::getfactorialresult;
		System.out.println(consumer.getFactorial(5));
	}

}
