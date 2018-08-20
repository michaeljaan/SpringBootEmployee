package com.cg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.pojo.Employee;
import com.cg.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	
	@RequestMapping("/employee")
	public List<Employee> viewAllEmployee()
	{
		return service.viewAllEmployee();
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getID(@PathVariable int id)
	{
		return service.getID(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employee")
	public void addNewEmployee(@RequestBody Employee employee)
	{
		service.addNewEmployee(employee);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/employee/{id}")
	public void updateEmployee(@PathVariable int id,@RequestBody Employee employee)
	{
		service.updateEmployee(id, employee);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/employee/{id}")
	public void deleteEmp(@PathVariable int id)
	{
		service.deleteEmp(id);
	}

}
