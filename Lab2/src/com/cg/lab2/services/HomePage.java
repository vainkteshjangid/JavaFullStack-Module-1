package com.cg.lab2.services;

import java.util.Scanner;

public class HomePage {

	public void goToHomePage() {
		System.out.println("Choose any one:-\n1.Book\n2.Journal Paper\n3.CD\n4.Video");
		int ch;
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		switch(ch) {
		case 1:
			BookServices bookServices=new BookServices();
			bookServices.bookHome();
			break;
		case 2:
			JournalPaperServices journalPaperServices=new JournalPaperServices();
			journalPaperServices.journalPaperHome();
			break;
		case 3:
			CDServices cdServices=new CDServices();
			cdServices.cdHome();
			break;
		case 4:
			VideoServices videoServices=new VideoServices();
			videoServices.videoHome();
			break;
		}
		
	}

}
