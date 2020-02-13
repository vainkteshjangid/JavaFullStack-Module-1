package com.cpg.lab10.CaseStudy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class EmployeeService {
	public static void main(String arg[])
	{
		EmployeeRepository repoObj=new EmployeeRepository();
		ArrayList<Employee> list=repoObj.createList();
		getTotalSalary(list);
		getDistinctDepartment(list);
		seniorEmployee(list);
	monthsAndDays(list);
		
	}
      public static void getTotalSalary(ArrayList<Employee> list1)
      {
    	  Double totalSalary=list1.stream().map(p->p.getSalary()).reduce(0.0,Double::sum);
  		System.out.println(totalSalary);
      }
      
      public static void getDistinctDepartment(ArrayList<Employee> list1)
      {
    	  list1.stream().map(p->p.department.getDepartmentName()).distinct().forEach(e->System.out.println(e+" "+list1.stream().filter(f->f.department.getDepartmentName().equals(e)).count()));
      }
      
      public static void seniorEmployee(ArrayList<Employee> list1)
      {
    	  Optional<String> d=list1.stream().map(p->p.getHiredate().toString()).reduce((a,b)->(a.compareTo(b)<0)?a:b);
    	  String str1=d.get();
    	  list1.stream().filter(b->b.getHiredate().toString().equals(str1)).map(q->q.getFirstName()).forEach(System.out::println);
      }
      public static void monthsAndDays(ArrayList<Employee> list1)
      {
    	  list1.stream().forEach(e->System.out.println(e.firstName+" "+e.lastName+" "+ChronoUnit.MONTHS.between(e.getHiredate(), LocalDate.now())+" Months " + ChronoUnit.DAYS.between(e.getHiredate(), LocalDate.now())%30+" Days"));
      }
      
}
