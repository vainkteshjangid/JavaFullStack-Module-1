package lab5Exercise1;

import java.util.Scanner;

public class TrafficLightsMain {

	public static void main(String[] args) {
	TrafficLights object=new TrafficLights();
	Scanner scanObj=new Scanner(System.in);
	System.out.println("1.Red\n2.Yellow\n3.Green");
	int inputNumber=scanObj.nextInt();
	object.showMessage(inputNumber);
	while(inputNumber!=0) {
		System.out.println("1.Red\n2.Yellow\n3.Green");
		inputNumber=scanObj.nextInt();
		object.showMessage(inputNumber);	
	}
	scanObj.close();
	}

}
