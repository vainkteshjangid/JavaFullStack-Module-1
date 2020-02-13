package com.cg.lab6.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity {

	public static void main(String[] args) {
		File file=new File("MyFile.txt");
		try {
			FileWriter Writer=new FileWriter(file);
			Writer.write("My name is Vainktesh.\nI study in Lovely Professional University\nI live in"
					+ " Punjab");
			Writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		try {
			FileReader reader=new FileReader(file);
			int i=1,ch;
			if(reader!=null) {
				System.out.print(i+++". ");
			}
			while((ch=reader.read())!=-1) {
				if(ch=='\n') {
					System.out.print(ch);
					System.out.print(i++);
				}
				else
				System.out.print((char)ch);
			}
			reader.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
