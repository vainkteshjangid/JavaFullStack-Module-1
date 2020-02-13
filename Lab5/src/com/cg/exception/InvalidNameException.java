package com.cg.exception;

public class InvalidNameException extends Exception{

	@Override
	public void printStackTrace() {
		//super.printStackTrace();
		System.out.println("Invalid name!  Please enter your full name.");
	}
	
}
