package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.PurchaseItem;
import com.ecommerce.entity.User;
 

public interface PurchaseItemRepository extends CrudRepository<PurchaseItem, Long>{
	
	public List<PurchaseItem> findBypurchaseId(long purchaseId);
	public void deleteBypurchaseId(long purchaseId);
}
