package com.jesus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jesus.model.Entry;

@Service
public interface EntryService {

	public List<Entry> getEntriesByEmployeeId(Integer id);
	
	public Integer createEntry(Entry entry);
	
}
