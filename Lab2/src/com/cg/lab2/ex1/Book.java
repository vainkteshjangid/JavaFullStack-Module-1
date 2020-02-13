package com.cg.lab2.ex1;

public class Book extends WrittenItem {

	public Book(int uid, String title, int numberOfCopies, String author) {
		super(uid, title, numberOfCopies, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		super.print();
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("checkIn method of Book.");
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("checkOut method of Book.");
	}
	
	

}
