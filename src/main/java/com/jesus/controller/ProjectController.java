package com.jesus.controller;

import java.util.List;

import com.jesus.models.Project;
import com.jesus.services.IProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private IProject project;


    /*@GetMapping
    public String getEntry(){
        return report.findAll();
        return "hola jesus";
    }*/

    @GetMapping
    public List<Project>getProject(){
        return project.findAll();
    }

    @PostMapping
    public Object createEntry(@RequestBody Project e){
        return project.save(e);
    }

    @PutMapping
    public void updateEntry(@RequestBody Project e) {
        project.saveAndFlush(e);
    }

    @GetMapping(value = "/{id}")
    public Object getEntry(@PathVariable int id){
        return project.findById(id);
    }
}
