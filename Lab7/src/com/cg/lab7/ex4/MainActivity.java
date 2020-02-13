package com.cg.lab7.ex4;

import java.util.HashMap;

import com.cg.lab7.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		HashMap<String,Integer> marks=new HashMap<String,Integer>();
		marks.put("Rohit", 95);
		marks.put("Krishna", 84);
		marks.put("Avinash", 57);
		marks.put("Priya",89);
		marks.put("Mahendra", 79);
		marks.put("Deepak", 80);
		marks.put("Anjali", 92);
		
		MyServices service=new MyServices();
		service.calculateGrades(marks);
	}

}
