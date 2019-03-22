package com.cg.hr.core.sevices;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.daos.EmployeeDao;
import com.cg.hr.core.daos.EmployeeDaoImpl;
import com.cg.hr.core.exceptions.Empexception;

public class EmployeeServicesImpl implements EmployeeService {
	private EmployeeDao dao;
	public EmployeeServicesImpl() throws Empexception
	{
		dao=new EmployeeDaoImpl();
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() throws Empexception {
		// TODO Auto-generated method stub
		return dao.fetchAllEmp();
	}

	@Override
	public Employee getEmpbyEid(int empId) throws Empexception {
		// TODO Auto-generated method stub
		return dao.getEmpbyEid(empId);
	}
   

}
