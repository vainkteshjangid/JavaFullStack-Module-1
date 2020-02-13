package com.cg.lab2.ex1;

public class Video extends MediaItem {

	private String director,genre;
	private int yearReleased;
	public Video(int uid, String title, int numberOfCopies, int runTime,String director,
			String genre,int yearReleased) {
		super(uid, title, numberOfCopies, runTime);
		this.director=director;
		this.genre=genre;
		this.yearReleased=yearReleased;
		// TODO Auto-generated constructor stub
	}
	
	

	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public int getYearReleased() {
		return yearReleased;
	}



	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}



	@Override
	public void print() {
		super.print();
		System.out.println("Director : "+director);
		System.out.println("Genre : "+genre);
		System.out.println("Year released : "+yearReleased);
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}


}
