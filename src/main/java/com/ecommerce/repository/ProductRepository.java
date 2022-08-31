package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.Product;
import com.ecommerce.entity.User;
 

public interface ProductRepository extends CrudRepository<Product, Long>{
	
	public List<Product> findByname(String name);
	public List<Product> findByCategoryId(long CategoryId);

}
