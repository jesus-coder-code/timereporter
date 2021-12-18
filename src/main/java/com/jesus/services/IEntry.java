package com.jesus.services;

import com.jesus.entity.Entry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface IEntry extends JpaRepository<Entry, Integer> {
    
}
