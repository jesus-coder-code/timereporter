package com.jesus.reporitory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jesus.model.Entry;

@Repository
public interface EntryRepository extends CrudRepository<Entry, Integer>{

	public List<Entry> findByEmployeeId(Integer employeeId);
}
