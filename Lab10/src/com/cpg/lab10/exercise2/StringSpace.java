package com.cpg.lab10.exercise2;

import java.util.function.Consumer;

public class StringSpace {
	public static void main(String ar [])
	{
		Consumer<String> consumer = (String str)->{ 
			StringBuilder str1=new StringBuilder();
			char ch;
			for(int strindex=0;strindex<str.length();strindex++)
		{
				ch=str.charAt(strindex);
			str1.append(ch);
			str1.append(" ");
		}
			str=str1.toString();
			System.out.println(str);
		
	};
	consumer.accept("CG");
	

}
}
