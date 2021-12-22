package com.jesus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.model.Employee;
import com.jesus.model.Entry;
import com.jesus.model.Project;
import com.jesus.reporitory.EmployeeReporitory;
import com.jesus.reporitory.EntryRepository;
import com.jesus.reporitory.ProjectReporitory;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryRepository  entryRepository;
	
	@Autowired
	private ProjectReporitory projectReporitory;
	
	@Autowired 
	private EmployeeReporitory  employeeReporitory;
	
	
	@Override
	public List<Entry> getEntriesByEmployeeId(Integer id) {
		return entryRepository.findByEmployeeId(id);
	}


	@Override
	public Integer createEntry(Entry entry) {
		Project project = projectReporitory.findById(entry.getProject().getId()).get();
		Employee employee = employeeReporitory.findById(entry.getEmployee().getId()).get();
		entry.setProject(project);
		entry.setEmployee(employee);
		
		Entry savedEntry = entryRepository.save(entry);
		return savedEntry.getId();
	}

}
