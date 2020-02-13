package com.cg.exception;

public class InvalidAgeException extends Exception {

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		//super.printStackTrace();
		System.out.println("Invalid age! Age should be greater than 15");
	}
	
}
