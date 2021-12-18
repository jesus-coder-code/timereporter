package com.jesus.services;

import com.jesus.entity.Projects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface IProjects extends JpaRepository <Projects, Integer> {
    
}
