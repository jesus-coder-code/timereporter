package com.jesus.service;

import com.jesus.model.Employee;

public interface EmployeeService {

	public Integer createEmployee(Employee employee);
	
	public Employee getEmployee(Integer id);
}
