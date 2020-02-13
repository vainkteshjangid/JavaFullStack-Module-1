package lab5Exercise3;

import java.util.Scanner;

public class PrintPrimeNumbersMain {

	public static void main(String[] args) {
	PrintPrimeNumbers object=new PrintPrimeNumbers();
	Scanner scanObj=new Scanner(System.in);
	System.out.println("Enter the number:");
	int inputNumber=scanObj.nextInt();
	for(int index=0;index<inputNumber;index++) {
		if(object.isPrime(index)) {
			System.out.print(index+" ");
		}
	}
	scanObj.close();
	}

}
