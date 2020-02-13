package lab5Exercise6;
import com.cg.eis.exception.EmployeeException;
public class EmployeeSalary {
public void checkSalary(int salary) throws EmployeeException{
	if(salary<3000) {
		throw new EmployeeException("Not enough salary!");
	}
	else {
		System.out.println("Going good!!");
	}
}

}
