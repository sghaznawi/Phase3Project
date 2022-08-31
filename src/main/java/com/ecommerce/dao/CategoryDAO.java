package com.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.ecommerce.entity.Category;
import com.ecommerce.entity.Product;
import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.repository.ProductRepository;

@Repository
@Component
public class CategoryDAO {

	@Autowired
	CategoryRepository categoryrepository;

	@Autowired
	ProductRepository productrepository;

	public Category getCategoryById(long id) {
		return categoryrepository.findById(id).get();
	}

	public void updateCategory(Category category) {
		categoryrepository.save(category);
	}

	public void deleteCategory(long id) {
	
		List<Product> listp = productrepository.findByCategoryId(id);
		for (Product p : listp) {
			p.setCategoryId(0);
			productrepository.save(p);
		}
		categoryrepository.deleteById(id);

	}

	public List<Category> getAllCategories() {
		Iterable<Category> ilist = categoryrepository.findAll();
		List<Category> list = new ArrayList<>();

		for (Category c : ilist)
			list.add(c);

		return list;
	}

}
