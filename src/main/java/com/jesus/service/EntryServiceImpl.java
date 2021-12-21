package com.jesus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.model.Entry;
import com.jesus.reporitory.EntryRepository;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryRepository  entryRepository;
	
	
	@Override
	public List<Entry> getEntriesByEmployeeId(Integer id) {
		
		return entryRepository.findByEmployeeId(id);
	}


	@Override
	public Integer createEntry(Entry entry) {
		Entry savedEntry = entryRepository.save(entry);
		return savedEntry.getId();
	}

}
