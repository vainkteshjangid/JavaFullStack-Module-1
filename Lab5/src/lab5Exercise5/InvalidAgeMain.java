package lab5Exercise5;

import java.util.Scanner;

public class InvalidAgeMain {
	public static void main(String[] args) {
	InvalidAge object=new InvalidAge();
	Scanner scanObj=new Scanner(System.in);
	int inputAge=scanObj.nextInt();
	try {
		object.validateAge(inputAge);
	}
	catch(InvalidAgeException e) {
		System.out.println(e);
	}
	scanObj.close();
	}

}
