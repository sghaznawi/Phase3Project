package com.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.ecommerce.entity.Purchase;
import com.ecommerce.repository.PurchaseRepository;

@Repository
@Component
public class PurchaseDAO {

	@Autowired
	PurchaseRepository Purchaserepository;

	public Purchase getPurchaseById(long id) {
		return Purchaserepository.findById(id).get();
	}

	public List<Purchase> getAllItems() {
		Iterable<Purchase> ilist = Purchaserepository.findAll();
		List<Purchase> list = new ArrayList<Purchase>();
		for (Purchase o : ilist)
			list.add(o);
		return list;
	}

	public List<Purchase> getAllItemsByUserId(long userId) {
		return Purchaserepository.findByuserId(userId);
	}

	public long updatePurchase(Purchase purchase) {

		return Purchaserepository.save(purchase).getID();
	}

}
