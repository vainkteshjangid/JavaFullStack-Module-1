package com.cg.exception;

public class InvalidSignalException extends Exception{

	@Override
	public void printStackTrace() {
		//super.printStackTrace();
		System.out.println("You have entered invalid signal.");
	}
	

}
