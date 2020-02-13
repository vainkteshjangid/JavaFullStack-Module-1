package com.cg.lab6.ex7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.cg.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String filename;
		File f=new File("demo.txt");
		try {
			FileWriter writer=new FileWriter(f);
			writer.write("This file was created by me.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter file name:");
		filename=s.next();
		MyServices service=new MyServices();
		service.getFileDetails(filename);

	}

}
