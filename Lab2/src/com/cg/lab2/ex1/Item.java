package com.cg.lab2.ex1;

public abstract class Item {

	private int uid;
	private String title;
	private int numberOfCopies;
	
	public Item(int uid, String title, int numberOfCopies) {
		super();
		this.uid = uid;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	@Override
	public String toString() {
		return "Item [uid=" + uid + ", title=" + title + ", numberOfCopies=" + numberOfCopies + "]";
	}
	
	public void print() {
		System.out.println("UID : "+uid);
		System.out.println("TITLE : "+title);
		System.out.println("No. of copies : "+numberOfCopies);
	}
	
	public abstract void checkIn();
	public abstract void checkOut();
	
	
	
	
}
