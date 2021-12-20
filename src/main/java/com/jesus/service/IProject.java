package com.jesus.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.jesus.model.Project;

@EnableJpaRepositories
@Repository
public interface IProject extends JpaRepository <Project, Integer> {
    
}
