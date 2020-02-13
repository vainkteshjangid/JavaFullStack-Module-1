package lab5Exercise6;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class EmployeeSalaryMain {

	public static void main(String[] args) {
	EmployeeSalary object=new EmployeeSalary();
	Scanner scanObj=new Scanner(System.in);
	System.out.println("Enter salary:");
	int inputSalary=scanObj.nextInt();
	try {
		object.checkSalary(inputSalary);
	}
	catch(EmployeeException e) {
		System.out.println(e);
	}
	scanObj.close();
	}

}
