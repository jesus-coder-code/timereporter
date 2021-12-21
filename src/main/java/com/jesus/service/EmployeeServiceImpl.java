package com.jesus.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.model.Employee;
import com.jesus.reporitory.EmployeeReporitory;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeReporitory  employeeReporitory;
	
	@Override
	public Integer createEmployee(Employee employee) {
		Employee savedEmployee = employeeReporitory.save(employee);
		return savedEmployee.getId();
	}

	@Override
	public Employee getEmployee(Integer id) {
		Optional<Employee> employee = employeeReporitory.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		}
		return null;
	}

}
