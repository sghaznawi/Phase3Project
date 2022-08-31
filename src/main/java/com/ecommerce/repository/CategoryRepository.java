package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.Category;
import com.ecommerce.entity.User;
 

public interface CategoryRepository extends CrudRepository<Category, Long>{
	
	public List<Category> findByname(String name);

}
