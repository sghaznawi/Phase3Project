package com.ecommerce.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.PurchaseItem;
import com.ecommerce.repository.PurchaseItemRepository; 

@Repository
@Component
public class PurchaseItemDAO {

	@Autowired
	PurchaseItemRepository PurchaseItemrepository;

	public PurchaseItem getItemById(long id) {
 
			return PurchaseItemrepository.findById(id).get();
		
	}	

	public List<PurchaseItem> getAllItemsByPurchaseId(long purchaseId) {
 		return PurchaseItemrepository.findBypurchaseId(purchaseId);
	}	
	
	public void updateItem(PurchaseItem item) {
		PurchaseItemrepository.save(item);
		
	}
	

	public void deleteItem(long id) {
		//Pending: Purchase total in purchase table should be updated after this
 
		PurchaseItemrepository.deleteById(id);
	}
	
	public void deleteAllItemsForPurchaseId(long purchaseId) {
 
		PurchaseItemrepository.deleteBypurchaseId(purchaseId);
	}	
}
