package com.jesus.reporitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jesus.model.Project;

@Repository
public interface ProjectReporitory extends CrudRepository<Project, Integer> {

}
