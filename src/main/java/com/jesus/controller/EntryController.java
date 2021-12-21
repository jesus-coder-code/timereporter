package com.jesus.controller;

import com.jesus.model.Entry;
import com.jesus.service.EntryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/entries")
public class EntryController {

	@Autowired
	private EntryService entryService; 
	

	@GetMapping("/{id}")
	public List<Entry> getEntriesByEmployeeId(@PathVariable Integer id){
		return entryService.getEntriesByEmployeeId(id);
	}

	@PostMapping
	public Integer createEntry(@RequestBody Entry entry) {
		return entryService.createEntry(entry);
	}
}
