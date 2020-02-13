package com.cpg.lab10.CaseStudy;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
public class EmployeeRepository {
       Employee emp1=new Employee();
       {
		emp1.setEmployeeId(101);
		emp1.setFirstName("Rahul");
		emp1.setLastName("Kumar");
		emp1.setEmail("rahul.kumar@lpu.co.in");
		emp1.setPhoneNumber("987654321");
		emp1.setDesignation("QA");
		emp1.setSalary(20000.00);
        emp1.setManagerId(201);
        emp1.setHiredate(LocalDate.parse("2018-05-20"));
        Department dep1=new Department();
        {
        	dep1.setDepartmentId(301);
        	dep1.setDepartmentName("CSE");
        	dep1.setManagerId(201);
        }
        emp1.setDepartment(dep1);
    }
	Employee emp2=new Employee();
	{
		emp2.setEmployeeId(102);
		emp2.setFirstName("Abhishek");
		emp2.setLastName("Kumar");
		emp2.setEmail("abhishek.kumar@lpu.co.in");
		emp2.setPhoneNumber("987654320");
		emp2.setDesignation("IOS Developer");
		emp2.setSalary(25000.00);
        emp2.setManagerId(201);
        emp2.setHiredate(LocalDate.parse("2018-04-20"));
        Department dep2=new Department();
        {
        	dep2.setDepartmentId(302);
        	dep2.setDepartmentName("IT");
        	dep2.setManagerId(201);
        }
        emp1.setDepartment(dep2);
    }
	Employee emp3=new Employee();
	{
		emp3.setEmployeeId(103);
		emp3.setFirstName("Deepak");
		emp3.setLastName("Kumar");
		emp3.setEmail("Deepak.kumar@lpu.co.in");
		emp3.setPhoneNumber("947654320");
		emp3.setDesignation("Android Developer");
		emp3.setSalary(23000.00);
        emp3.setManagerId(201);
        emp3.setHiredate(LocalDate.parse("2012-12-21"));
        Department dep3=new Department();
        {
        	dep3.setDepartmentId(303);
        	dep3.setDepartmentName("ECE");
        	dep3.setManagerId(201);
        }
        emp1.setDepartment(dep3);
    }
	ArrayList<Employee> list1=new ArrayList<>();
	public ArrayList<Employee> createList()
	{
	list1.add(emp1);
	list1.add(emp2);
	list1.add(emp3);
	return list1;
	}
	
	
}
