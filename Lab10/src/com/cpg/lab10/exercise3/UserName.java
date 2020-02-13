package com.cpg.lab10.exercise3;



public class UserName {
	public static void main(String ar[])
	{
		Name name=(String fn,String ln)->{
			if(fn.length()>=6&&ln.length()>=5)
				return true;
			
			return false;
			
		};
		
		System.out.println( name.validateName("satyam", "sinha"));
	}

}
