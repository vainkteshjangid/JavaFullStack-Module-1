package lab5Exercise3;

public class PrintPrimeNumbers {
public boolean isPrime(int number) {
	if(number<=1) {
		return false;
	}
	for(int index=2;index<number;index++) {
		if(number%index==0) {
			return false;
		}
	}
	return true;
}	

}

