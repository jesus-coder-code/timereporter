package com.jesus.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.jesus.model.Entry;

@EnableJpaRepositories
@Repository
public interface IEntry extends JpaRepository<Entry, Integer> {
    
}
