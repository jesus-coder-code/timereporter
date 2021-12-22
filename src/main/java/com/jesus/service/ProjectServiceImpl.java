package com.jesus.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.model.Admin;
import com.jesus.model.Project;
import com.jesus.reporitory.AdminRepository;
import com.jesus.reporitory.ProjectReporitory;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired 
	private ProjectReporitory  projectReporitory;
	
	@Autowired
	private AdminRepository  adminRepository;
	
	
	@Override
	public Integer createProject(Project project) {
		
		
		//Get the admin
		Admin admin = adminRepository.findById(project.getAdmin().getId()).get();
		project.setAdmin(admin);
		
		Project savedProject = projectReporitory.save(project);
		return savedProject.getId();
	}

	@Override
	public Project getProject(Integer id) {
		Optional<Project> project = projectReporitory.findById(id);
		
		if(project.isPresent()) {
			return project.get();
		}
		
		return null;
	}

}
