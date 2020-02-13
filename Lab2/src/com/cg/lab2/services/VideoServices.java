package com.cg.lab2.services;

import java.util.Scanner;

import com.cg.lab2.ex1.JournalPaper;
import com.cg.lab2.ex1.MainActivity;
import com.cg.lab2.ex1.Video;

public class VideoServices {

	MainActivity mainObj=new MainActivity();
	Scanner s=new Scanner(System.in);

	public void videoHome() {
		System.out.println("\n*************Video Services*************");
		System.out.println("1.See the List.\n2.Check In.\n3.Check Out.");
		int ch;
		ch=s.nextInt();
		switch(ch) {
		case 1:
			printVideo();
			break;
		case 2:
			checkInVideo();
			break;
		case 3:
			checkOutVideo();
			break;
		}
	}

	private void checkOutVideo() {
		// TODO Auto-generated method stub
		System.out.print("\nEnter Video UID : ");
		int id=s.nextInt();
		for(Video itr:mainObj.getVideo()) {
			if(itr.getUid()==id) {
				itr.setNumberOfCopies(itr.getNumberOfCopies()+1);
				System.out.println("Checked out successfully!");
				break;
			}
		}
		
	}

	private void checkInVideo() {
		// TODO Auto-generated method stub
		System.out.print("\nEnter Video UID : ");
		int id=s.nextInt();
		for(Video itr:mainObj.getVideo()) {
			if(itr.getUid()==id) {
				itr.setNumberOfCopies(itr.getNumberOfCopies()-1);
				System.out.println("Checked in successfully!");
				break;
			}
		}
	}

	private void printVideo() {
		// TODO Auto-generated method stub
		for(Video itr:mainObj.getVideo()) {
			itr.print();
		}
	}

}
