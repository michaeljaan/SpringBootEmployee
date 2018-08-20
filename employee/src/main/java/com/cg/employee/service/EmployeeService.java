package com.cg.employee.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cg.employee.dao.EmployeeDAO;
import com.cg.employee.pojo.Employee;



@Service
public class EmployeeService {

	EmployeeDAO dao=new EmployeeDAO();
	
	public void addNewEmployee(Employee employee)
	{
		dao.addNewEmployee(employee);
	}
	
	public ArrayList<Employee> viewAllEmployee()
	{
		return dao.viewAllEmployee();
	}
	
	public Employee getID(int id)
	{
		return dao.getID(id);
	}
	public void updateEmployee(int id, Employee employee)
	{
		dao.updateEmployee(id, employee);
	}
	public void deleteEmp(int id) {
		dao.deleteEmp(id);
	}
	
	
}
