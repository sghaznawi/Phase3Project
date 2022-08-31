package com.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.repository.PurchaseItemRepository; 

@Repository
@Component
public class ProductDAO {

	@Autowired
	ProductRepository productrepository;
	
	@Autowired
	PurchaseItemRepository PurchaseItemrepository;

	public Product getProductById(long id) { 
		Product p = productrepository.findById(id).get();  
		return p;	
	}
	
	
	public void updateProduct(Product product) {	
		productrepository.save(product);
		
	}
	
	public void deleteProduct(long id) {
		PurchaseItemrepository.deleteById(id);
	    productrepository.deleteById(id);
	}
	
	public List<Product> getAllProducts() {
		Iterable<Product> ilist = productrepository.findAll(); 
		List<Product> list	=	new	ArrayList<Product>();
		for(Product i : ilist)
			list.add(i);
		return list;
	}	
	
}
