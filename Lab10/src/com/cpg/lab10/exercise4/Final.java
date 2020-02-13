package com.cpg.lab10.exercise4;



import java.util.function.Consumer;
import java.util.function.Supplier;

public class Final {
	public static void main(String ar[])
	{
		Simple simple=new Simple();
		Consumer<String> consumer=simple::setName;
		consumer.accept("satyam");
		Supplier<String> supplier=simple::getName;
		System.out.println("Name: "+supplier.get());
	}

}
