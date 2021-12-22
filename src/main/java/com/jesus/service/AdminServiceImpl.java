package com.jesus.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.model.Admin;
import com.jesus.reporitory.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public Integer createAdmin(Admin admin) {
		Admin savedAdmin = adminRepository.save(admin);
		return savedAdmin.getId();
	}

	@Override
	public Admin getAdmin(Integer id) {
		Optional<Admin> admin = adminRepository.findById(id);
		
		if(admin.isPresent()) {
			return admin.get();
		}
		
		return null;
	}

}
