package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class Service extends Employee implements EmployeeService  
{
  Employee emp;
	public Service(Employee e)
	{
		this.emp=e;
	}
	@Override
	public void insuranceSystem() {
		
		System.out.println("-->"+emp.getInsuranceScheme());
	}

	@Override
	public void display() {
		System.out.println("\n "+emp.getName()+" Your Current insurance Scheme is:");
		insuranceSystem();
	}

	@Override
	public Employee getEmployeeDetails() {
		
		return this.emp;
	}
	
	
	

}
