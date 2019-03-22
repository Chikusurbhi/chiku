package com.cg.hr.core.sevices;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.Empexception;

public interface EmployeeService {
	public ArrayList<Employee> fetchAllEmp() throws Empexception;
	public Employee getEmpbyEid(int empId) throws Empexception;
}
