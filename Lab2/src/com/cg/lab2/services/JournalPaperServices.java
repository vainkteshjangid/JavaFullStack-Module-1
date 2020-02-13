package com.cg.lab2.services;

import java.util.Scanner;

import com.cg.lab2.ex1.JournalPaper;
import com.cg.lab2.ex1.MainActivity;

public class JournalPaperServices {

	MainActivity mainObj=new MainActivity();
	Scanner s=new Scanner(System.in);

	public void journalPaperHome() {
		System.out.println("\n*************Journal Paper Services*************");
		System.out.println("1.See the List.\n2.Check In.\n3.Check Out.");
		int ch;
		ch=s.nextInt();
		switch(ch) {
		case 1:
			printJournalPaper();
			break;
		case 2:
			checkInJournalPaper();
			break;
		case 3:
			checkOutJournalPaper();
			break;
		}
	}

	private void checkOutJournalPaper() {
		// TODO Auto-generated method stub
		System.out.print("\nEnter Journal Paper UID : ");
		int id=s.nextInt();
		for(JournalPaper itr:mainObj.getJournalPaper()) {
			if(itr.getUid()==id) {
				itr.setNumberOfCopies(itr.getNumberOfCopies()+1);
				System.out.println("Checked out successfully!");
				break;
			}
		}
		
	}

	private void checkInJournalPaper() {
		// TODO Auto-generated method stub
		System.out.print("\nEnter Journal Paper UID : ");
		int id=s.nextInt();
		for(JournalPaper itr:mainObj.getJournalPaper()) {
			if(itr.getUid()==id) {
				itr.setNumberOfCopies(itr.getNumberOfCopies()-1);
				System.out.println("Checked in successfully!");
				break;
			}
		}
	}

	private void printJournalPaper() {
		// TODO Auto-generated method stub
		for(JournalPaper itr:mainObj.getJournalPaper()) {
			itr.print();
		}
	}


}
