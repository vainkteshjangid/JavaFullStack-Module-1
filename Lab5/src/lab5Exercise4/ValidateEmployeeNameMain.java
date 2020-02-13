package lab5Exercise4;

import java.util.Scanner;

public class ValidateEmployeeNameMain {

	public static void main(String[] args) {
	ValidateEmployeeName object=new ValidateEmployeeName();
	Scanner scanObj=new Scanner(System.in);
	System.out.println("Enter first name:");
	String inputFirstName=scanObj.nextLine();
	System.out.println("Enter second name:");
	String inputSecondName=scanObj.nextLine();
	
	try {
		object.validateName(inputFirstName, inputSecondName);
	}
	catch(ValidateEmployeeNameException e) {
		System.out.println(e);
	}
	scanObj.close();
	}

}
