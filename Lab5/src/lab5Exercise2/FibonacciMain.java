package lab5Exercise2;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
	FibonacciRecursive object1=new FibonacciRecursive();
	FibonacciNonRecursive object2=new FibonacciNonRecursive();
	
	Scanner scanObj=new Scanner(System.in);
	System.out.println("Enter your choice:\n1.Recursive\n2.non recursive.");
	int choice=scanObj.nextInt();
	System.out.println("Enter the element to show:");
	int inputNumber=scanObj.nextInt();
	switch(choice) {
	case 1:
		System.out.println("The element is "+object1.showElement(inputNumber));
		break;
	case 2:
		System.out.println("The element is:"+object2.showElement(inputNumber));
		break;
	}
	scanObj.close();
	}

}
