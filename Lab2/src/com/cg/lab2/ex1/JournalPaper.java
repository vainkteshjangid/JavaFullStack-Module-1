package com.cg.lab2.ex1;

public class JournalPaper extends WrittenItem {
	private int yearPublished;
	public JournalPaper(int uid, String title, int numberOfCopies, String author,int yearPublished) {
		super(uid, title, numberOfCopies, author);
		this.yearPublished=yearPublished;
	}
	

	public int getYearPublished() {
		return yearPublished;
	}


	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}


	@Override
	public void print() {
		super.print();
		System.out.println("Year published : "+yearPublished);
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("checkIn method of journalPaper.");
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("checkOut method of JournalPaper.");
	}

}
