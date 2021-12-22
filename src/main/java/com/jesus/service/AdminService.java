package com.jesus.service;

import com.jesus.model.Admin;

public interface AdminService {

	public Integer createAdmin(Admin admin);
	
	public Admin getAdmin(Integer id);
	
}
