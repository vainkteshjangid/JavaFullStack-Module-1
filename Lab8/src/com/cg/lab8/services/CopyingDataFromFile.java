package com.cg.lab8.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingDataFromFile extends Thread{
	File source,target;
	
	public CopyingDataFromFile(File sourceFile,File targetFile) {
		this.source=sourceFile;
		this.target=targetFile;
	}
	
	public void run() {
		try {
			FileOutputStream fos=new FileOutputStream(target,true);
			FileInputStream fis=new FileInputStream(source);
			while(true) {
				byte b1[]=new byte[10];
				fis.read(b1);
				System.out.println("10 Characters read.");
				Thread.sleep(5000);
				fos.write(b1);
				int b;
				if((b=fis.read())==-1) {
					System.out.println("File ended.");
				}
				else
					fos.write(b1);
			}
		}catch(FileNotFoundException e1) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
