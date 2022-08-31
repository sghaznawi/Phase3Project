package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.Admin;
import com.ecommerce.entity.User;
 

public interface AdminRepository extends CrudRepository<Admin, Long>{
	
	public List<Admin> findByadminId(String adminId);

}
