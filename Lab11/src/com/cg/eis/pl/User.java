package com.cg.eis.pl;


import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class User {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.print("\nEnter Employee Id:");
		int id=scan.nextInt();
		System.out.print("\nEnter Employee Name:");
		scan.nextLine();
		String name=scan.nextLine();
		
		System.out.print("\nChoose Designation of employee:\n1)System Associate\n2)Programmer\n3)Manager\n4)Clerk\n");
		int choice=scan.nextInt();
		String designation;
		switch(choice)
		{
		case 1:
			designation="System Associate";
			break;
		case 2:
			designation="Programmer";
			break;
		case 3:
			designation="Manager";
			break;
		case 4:
			designation="Clerk";
			break;
		default:
			System.out.println("You have choosed incorrect option");
			 return;
		}
		int salary=0;
		String insurancescheme="";
		if(designation.contentEquals("System Associate"))
		{
			System.out.println("\nEnter Amount of salary: based on your designaation:"+designation+" of range: >5000 && <9000");
		  salary=scan.nextInt();
		   if(salary>5000 && salary<9000)
			   insurancescheme="Scheme C";
		   else
		   {
			   System.out.println("Entered Wrong amount!");
		       return;
		   }
		}
		else if(designation.contentEquals("Programmer"))
		{
			System.out.println("\nEnter Amount of salary: based on your designaation:"+designation+" of range: >=20000 && <40000");
		  salary=scan.nextInt();
		   if(salary>=20000 && salary<40000)
			   insurancescheme="Scheme B";
		   else
		   {
			   System.out.println("Entered Wrong amount!");
		       return;
		   }
		}
		else if(designation.contentEquals("Manager"))
		{
			System.out.println("\nEnter Amount of salary: based on your designaation:"+designation+" of range: >=40000");
		  salary=scan.nextInt();
		   if(salary>=40000)
			   insurancescheme="Scheme A";
		   else
		   {
			   System.out.println("Entered Wrong amount!");
		       return;
		   }
		}
		else if(designation.contentEquals("Clerk"))
		{
			System.out.println("\nEnter Amount of salary: based on your designaation:"+designation+" of range: <5000");
		  salary=scan.nextInt();
		   if(salary<5000)
			   insurancescheme="No Scheme";
		   else
		   {
			   System.out.println("Entered Wrong amount!");
		       return;
		   }
		}
		Employee em=new Employee();
		em.setId(id);
		em.setName(name);
		em.setSalary(salary);
		em.setDesignation(designation);
		em.setInsuranceScheme(insurancescheme);
		Service ser=new Service(em);
	  System.out.println("\n\n");
	    ser.display();
	  String details=  em.toString();
	  System.out.println(details);
		
		scan.close();
		

	}

}
