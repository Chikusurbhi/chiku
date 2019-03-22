package com.cg.hr.core.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.Empexception;
import com.cg.hr.core.util.JDBCUtil;
import com.cg.hr.core.util.JPAUtil;

public class EmployeeDaoImpl implements EmployeeDao
{
private Connection connect;
	
	public EmployeeDaoImpl() throws Empexception
	{
		JDBCUtil util= new JDBCUtil();
		connect = util.getConnect();
	}
	
//	@Override
//	public Employee addEmp(Employee emp) 
//	{
//		entityTran.begin();//begin the transaction
//		em.persist(emp);//persist is used for insert
//		entityTran.commit();//committed the transaction
//		return emp;
//		
//	}

	@Override
	public ArrayList<Employee> fetchAllEmp() throws Empexception
	{
        Statement stmt=null;
        ResultSet rs=null;
        ArrayList<Employee> empList=new ArrayList<>();
		try {
			stmt=connect.createStatement();
			rs=stmt.executeQuery("SELECT emp_id,emp_name,emp_sal FROM emp1");
			
			while(rs.next()) {
				
				int empNo=rs.getInt("emp_id");
				String empNm=rs.getString("emp_name");
				float empSal=rs.getFloat("emp_sal");
				
				Employee emp=new Employee(empNo,empNm,empSal);
				empList.add(emp);
			}
		
		return empList;
	     }catch(Exception e) {
	    	 throw new Empexception("Something wrong in fetchAll",e);
	     }finally {
	    	 try {
	    		 if(rs!=null) {
	    			 rs.close();
	    		 }
	    		 if(stmt!=null) {
	    			 stmt.close();
	    		 }
	    	 }catch(Exception e) {
	    		 throw new Empexception("Something wrong in fetchAll",e);
	    	 }}
	     }

		
//	@Override
//	public Employee deleteEmp(int empId) 
//	{
//		entityTran.begin();
//		Employee e1= em.find(Employee.class,empId);
//		em.remove(e1);
//		entityTran.commit();
//		return e1;
//	}
//
	@Override
	public Employee getEmpbyEid(int empId) throws Empexception {
		
		PreparedStatement stmt=null;
        ResultSet rs=null;
        Employee emp=null;
		try {
			stmt=connect.prepareStatement("SELECT emp_id,emp_name,emp_sal FROM emp1 WHERE emp_id=?");
			stmt.setInt(1, empId);
			rs=stmt.executeQuery();
			
			while(rs.next()) {
				
				int empNo=rs.getInt("emp_id");
				String empNm=rs.getString("emp_name");
				float empSal=rs.getFloat("emp_sal");
				
			     emp=new Employee(empNo,empNm,empSal);
				
			}
		
		return emp;
	     }catch(Exception e) {
	    	 throw new Empexception("Something wrong in fetchAll",e);
	     }finally {
	    	 try {
	    		 if(rs!=null) {
	    			 rs.close();
	    		 }
	    		 if(stmt!=null) {
	    			 stmt.close();
	    		 }
	    	 }catch(Exception e) {
	    		 throw new Empexception("Something wrong in fetchAll",e);
	    	 }
	}
//
//	@Override
//	public Employee updateEmp(int empId, String newName, float newSal) {
//		Employee ee=em.find(Employee.class, empId);
//		ee.setEmpName(newName);
//		ee.setEmpSal(newSal);
//		entityTran.begin();
//		em.merge(ee);
//		entityTran.commit();
//		return ee;
//	}

}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}}
