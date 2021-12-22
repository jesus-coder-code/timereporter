package com.jesus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jesus.model.Admin;
import com.jesus.service.AdminService;

@RestController
@RequestMapping("/admins")
public class AdminController {
 
	@Autowired
	private AdminService adminService;
	
	@PostMapping
	public Integer createAdmin(@RequestBody Admin admin) {
		return adminService.createAdmin(admin);
	}
	
	@GetMapping("/{id}")
	public Admin getAdmin(@PathVariable Integer id) {
		return adminService.getAdmin(id);
	}
	
}
