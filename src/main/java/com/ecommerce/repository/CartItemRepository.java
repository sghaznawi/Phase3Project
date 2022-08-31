package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.CartItem;
import com.ecommerce.entity.User;
 

public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	
	public List<CartItem> findByname(String name);

}
