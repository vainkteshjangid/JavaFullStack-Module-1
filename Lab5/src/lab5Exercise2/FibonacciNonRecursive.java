package lab5Exercise2;

public class FibonacciNonRecursive {
public int showElement(int number) {
	int temp=0,number1=1,number2=1;
	for(int index=2;index<number;index++) {
		temp=number2;
		number2=number1+number2;
		number1=temp;
	}
	return number2;
}
}
