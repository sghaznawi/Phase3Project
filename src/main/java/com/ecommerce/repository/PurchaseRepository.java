package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.Purchase;
import com.ecommerce.entity.User;
 

public interface PurchaseRepository extends CrudRepository<Purchase, Long>{
	
	public List<Purchase> findByuserId(long userId);

}
