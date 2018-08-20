package com.cg.employee.dao;

import java.util.ArrayList;

import com.cg.employee.pojo.Employee;


public class EmployeeDAO {

	private static ArrayList<Employee> emp;
	
	static {
		emp =new ArrayList<>();
	}
	
	public void addNewEmployee(Employee employee)
	{
		emp.add(employee);
	}
	
	public ArrayList<Employee> viewAllEmployee()
	{
		return emp;
	}
	
	public Employee getID(int id)
	{
		Employee employ=null;
		for(Employee a:emp)
		{
			if(a.getEmpID()==id)
			{
				employ=a;
			}
		}
		return employ;
	}
	public void updateEmployee(int id, Employee employee) {
		for(int i=0;i<emp.size();i++)
		{
			Employee t= emp.get(i);
			if(t.getEmpID()==id)
			{
				emp.set(i, employee);
				return;
			}
		}
		
	}
	public void deleteEmp(int id) {
		emp.removeIf(t ->t.getEmpID()==id);
	}
	
	
}
