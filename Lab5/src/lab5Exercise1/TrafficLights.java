package lab5Exercise1;

public class TrafficLights {
public void showMessage(int number) {
	switch(number) {
	case 1:
		System.out.println("STOP!!");
		break;
	case 2:
		System.out.println("Ready");
		break;
	case 3:
		System.out.println("Go!!");
		break;
	default:
		System.out.println("Try Again!!!");
	}
}
}
