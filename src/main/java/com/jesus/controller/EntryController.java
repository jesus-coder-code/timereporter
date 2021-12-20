package com.jesus.controller;

import com.jesus.model.Entry;
import com.jesus.service.IEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/entry")
public class EntryController {

    @Autowired
    private IEntry report;


    @GetMapping
    public String getEntry(){
        /*return report.findAll();*/
        return "hola jesus";

    }

    @PostMapping
    public Object createEntry(@RequestBody Entry e){
        return report.save(e);
    }

    @PutMapping
    public void updateEntry(@RequestBody Entry e) {
        report.saveAndFlush(e);
    }

    @GetMapping(value = "/{id}")
    public Object getEntry(@PathVariable int id){
        return report.findById(id);
    }

}
