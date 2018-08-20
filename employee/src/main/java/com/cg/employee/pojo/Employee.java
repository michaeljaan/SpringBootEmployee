package com.cg.employee.pojo;



public class Employee {
	
	private int empID;
	private String name;
	private String deptName;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empID, String name, String deptName) {
		super();
		this.empID = empID;
		this.name = name;
		this.deptName = deptName;
	}
	
	

}
