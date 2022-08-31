package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.User;
 

public interface UserRepository extends CrudRepository<User, Long>{
	
	public List<User> findByemailId(String email);

}
