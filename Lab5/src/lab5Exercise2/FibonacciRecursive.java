package lab5Exercise2;

public class FibonacciRecursive {
public int showElement(int number) {
	int fibNumber=0;
	while(number>0) {
		if(number==1 || number==2) {
			return 1;
		}
		else {
			fibNumber=showElement(number-1)+showElement(number-2);
			return fibNumber;
		}
	}
	return 0;
}
}
