package com.cg.hr.core.beans;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp1")
public class Employee 
{  
   @Id
   //@GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name="emp_id",length=20)
   private int empId;
   
   @Column(name="emp_name",length=30)
   private String empName;
   
   @Column(name="emp_sal",length=10)
   private float empSal;
   
 //if u don want empDOJ mapping then use  transient
  

   public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public float getEmpSal() {
	return empSal;
}
public void setEmpSal(float empSal) {
	this.empSal = empSal;
}



@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + " ]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empId, String empName, float empSal) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSal = empSal;
	
}
   
   
}
