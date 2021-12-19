package com.jesus.services;

import com.jesus.models.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface IProject extends JpaRepository <Project, Integer> {
    
}
