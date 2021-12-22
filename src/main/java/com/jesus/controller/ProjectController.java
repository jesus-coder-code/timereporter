package com.jesus.controller;

import com.jesus.model.Project;
import com.jesus.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/projects")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@PostMapping
	public Integer createProject(@RequestBody Project project) {
		return projectService.createProject(project);
	}

	@GetMapping("/{id}")
	public Project getProject(@PathVariable Integer id) {
		return projectService.getProject(id);
	}
}
