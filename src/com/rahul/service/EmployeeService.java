package com.rahul.service;

import java.util.List;

import com.rahul.model.Employee;

/**
 * @author 
 *
 */
public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}
