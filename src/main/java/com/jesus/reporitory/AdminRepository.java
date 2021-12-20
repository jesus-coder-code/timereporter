package com.jesus.reporitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jesus.model.Admin;


@Repository
public interface AdminRepository  extends CrudRepository<Admin, Integer>{

}
