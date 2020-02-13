package com.cg.lab2.services;

import java.io.IOException;
import java.util.Scanner;

import com.cg.lab2.ex1.Book;
import com.cg.lab2.ex1.MainActivity;

public class BookServices {
	
	MainActivity mainObj=new MainActivity();
	Scanner s=new Scanner(System.in);

	public void bookHome() {
		System.out.println("\n*************Book Services*************");
		System.out.println("1.See the List.\n2.Check In.\n3.Check Out.");
		int ch;
		ch=s.nextInt();
		switch(ch) {
		case 1:
			printBook();
			break;
		case 2:
			checkInBook();
			break;
		case 3:
			checkOutBook();
			break;
		}
	}

	private void checkOutBook() {
		// TODO Auto-generated method stub
		System.out.print("\nEnter book UID : ");
		int id=s.nextInt();
		for(Book itr:mainObj.getBooks()) {
			if(itr.getUid()==id) {
				itr.setNumberOfCopies(itr.getNumberOfCopies()+1);
				System.out.println("Checked out successfully!");
				break;
			}
		}
		
	}

	private void checkInBook() {
		// TODO Auto-generated method stub
		System.out.print("\nEnter book UID : ");
		int id=s.nextInt();
		for(Book itr:mainObj.getBooks()) {
			if(itr.getUid()==id) {
				itr.setNumberOfCopies(itr.getNumberOfCopies()-1);
				System.out.println("Checked in successfully!");
				break;
			}
		}
	}

	private void printBook() {
		// TODO Auto-generated method stub
		for(Book itr:mainObj.getBooks()) {
			itr.print();
		}
	}

}
