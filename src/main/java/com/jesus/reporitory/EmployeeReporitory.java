package com.jesus.reporitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jesus.model.Employee;

@Repository
public interface EmployeeReporitory extends CrudRepository<Employee, Integer>{


}
