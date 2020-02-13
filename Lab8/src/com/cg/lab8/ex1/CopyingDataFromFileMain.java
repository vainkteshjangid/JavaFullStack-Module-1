package com.cg.lab8.ex1;

import java.io.File;
import java.util.Scanner;

import com.cg.lab8.services.CopyingDataFromFile;

public class CopyingDataFromFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter source file:");
		String source=s.next();
		System.out.println("Enter target file:");
		String target=s.next();
		File sourceFile=new File(source);
		File targetFile=new File(target);
		if(sourceFile.exists()&&targetFile.exists()) {
			CopyingDataFromFile obj=new CopyingDataFromFile(sourceFile,targetFile);
			obj.start();
		}
		else if(!sourceFile.exists()) {
			System.out.println("Source file does not exists....");
		}
		else if(!targetFile.exists()) {
			System.out.println("Target file does not exists....");
		}
		
		s.close();
	}

}
