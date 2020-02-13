package lab5Exercise5;
import lab5Exercise5.InvalidAgeException;

public class InvalidAge {
public void validateAge(int age) throws InvalidAgeException{
	if(age<=15) {
		throw new InvalidAgeException("Age should be above 15.");
	}
	else {
		System.out.println("Okay!!");
	}
}
}
