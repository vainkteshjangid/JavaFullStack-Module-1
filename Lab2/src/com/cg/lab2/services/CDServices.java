package com.cg.lab2.services;

import java.util.Scanner;

import com.cg.lab2.ex1.CD;
import com.cg.lab2.ex1.JournalPaper;
import com.cg.lab2.ex1.MainActivity;

public class CDServices {

	MainActivity mainObj=new MainActivity();
	Scanner s=new Scanner(System.in);

	public void cdHome() {
		System.out.println("\n*************CD Services*************");
		System.out.println("1.See the List.\n2.Check In.\n3.Check Out.");
		int ch;
		ch=s.nextInt();
		switch(ch) {
		case 1:
			printCD();
			break;
		case 2:
			checkInCD();
			break;
		case 3:
			checkOutCD();
			break;
		}
	}

	private void checkOutCD() {
		// TODO Auto-generated method stub
		System.out.print("\nEnter CD UID : ");
		int id=s.nextInt();
		for(CD itr:mainObj.getCD()) {
			if(itr.getUid()==id) {
				itr.setNumberOfCopies(itr.getNumberOfCopies()+1);
				System.out.println("Checked out successfully!");
				break;
			}
		}
		
	}

	private void checkInCD() {
		// TODO Auto-generated method stub
		System.out.print("\nEnter CD UID : ");
		int id=s.nextInt();
		for(CD itr:mainObj.getCD()) {
			if(itr.getUid()==id) {
				itr.setNumberOfCopies(itr.getNumberOfCopies()-1);
				System.out.println("Checked in successfully!");
				break;
			}
		}
	}

	private void printCD() {
		// TODO Auto-generated method stub
		for(CD itr:mainObj.getCD()) {
			itr.print();
		}
	}

}
