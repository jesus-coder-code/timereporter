package com.jesus.service;

import com.jesus.model.Project;

public interface ProjectService {

	public Integer createProject(Project project);
	
	public Project getProject(Integer id);
	
}
