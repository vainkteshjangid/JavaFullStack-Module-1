package com.cg.lab7.ex8;

import com.cg.lab7.services.MyServices;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,23,56,45,28,32,28,14,34};
		MyServices service=new MyServices();
		int res[]=service.modifyArray(arr);

	}

}
