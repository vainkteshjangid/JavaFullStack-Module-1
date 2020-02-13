package com.cg.lab2.ex1;

public class CD extends MediaItem{

	private String artist,genre;
	public CD(int uid, String title, int numberOfCopies, int runTime,String artist,String genre) {
		super(uid, title, numberOfCopies, runTime);
		this.artist=artist;
		this.genre=genre;
		// TODO Auto-generated constructor stub
	}
	

	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public void print() {
		super.print();
		System.out.println("Artist : "+artist);
		System.out.println("Genre : "+genre);
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("checkIn method of CD");
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("checkOut mehtod of CD.");
	}

	

}
