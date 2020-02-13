package com.cg.lab2.ex1;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int uid, String title, int numberOfCopies,String author) {
		super(uid, title, numberOfCopies);
		this.author=author;

	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Author : "+author);
	}

	
}
