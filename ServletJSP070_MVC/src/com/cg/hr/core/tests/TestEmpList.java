package com.cg.hr.core.tests;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.Empexception;
import com.cg.hr.core.sevices.EmployeeService;
import com.cg.hr.core.sevices.EmployeeServicesImpl;

public class TestEmpList {

	public static void main(String[] args) {
		try {
	EmployeeService services=new EmployeeServicesImpl();
	
	ArrayList<Employee> empList= services.fetchAllEmp();
	
	for(Employee emp: empList)
	{
		System.out.println(emp);
	}
	}catch(Empexception e) {
		e.printStackTrace();
	}

}}
