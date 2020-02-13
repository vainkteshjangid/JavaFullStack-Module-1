package com.cg.lab2.ex1;

import java.util.ArrayList;

import com.cg.lab2.services.HomePage;

public class MainActivity {
	static ArrayList<Book> book=new ArrayList<>();
	static ArrayList<JournalPaper> jp=new ArrayList<>();
	static ArrayList<CD> cd=new ArrayList<>();
	static ArrayList<Video> video=new ArrayList<>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		book.add(new Book(101,"Think & Grow rich",15,"Nepolian Hill"));
		book.add(new Book(102,"One Indian Girl",12,"Chetan Bhagat"));
		book.add(new Book(103,"The 5 AM Club",23,"Robin Sharma"));
		
		jp.add(new JournalPaper(201,"Air pollution",05,"Sudhanshu Goyal",2013));
		jp.add(new JournalPaper(202,"Evolution of tigers",14,"Arun Dutt",2008));
		jp.add(new JournalPaper(203,"The Black hole",23,"Robert peterson",2018));
		
		cd.add(new CD(301,"Game of thrones",25,3,"John patrick","Adventurous"));
		cd.add(new CD(302,"Call of duty",21,1,"Jack Riyan","Comedy"));
		cd.add(new CD(303,"Suits",25,8,"John patrick, Mike Ross","Drama, Comedy"));
		
		video.add(new Video(401,"Ironman",26,2,"Johny walter","Action, Drama",2013));
		video.add(new Video(402,"Gadar",250,3,"Anil Sharma","Action, Drama",2001));
		video.add(new Video(403,"Dabang",26,3,"Prabhu deva","Action, Drama",2010));
		
		HomePage service=new HomePage();
		service.goToHomePage();
		
		
		
	}
	
	public ArrayList<Book> getBooks(){
		return book;
	}
	
	public ArrayList<JournalPaper> getJournalPaper(){
		return jp;
	}
	
	public ArrayList<CD> getCD(){
		return cd;
	}
	
	public ArrayList<Video> getVideo(){
		return video;
	}

}
