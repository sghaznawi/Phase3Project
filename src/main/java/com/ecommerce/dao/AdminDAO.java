package com.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Admin;
import com.ecommerce.repository.AdminRepository;

@Repository
@Component
public class AdminDAO {

	@Autowired
	AdminRepository Adminrepository;

	public Admin authenticate(String adminId, String pwd) {

		return Adminrepository.findByadminId(adminId).get(0);

	}

	public Admin getAdminById(long id) {
		return Adminrepository.findById(id).get();

	}

	public void updatePwd(Admin admin) {
		Adminrepository.save(admin);

	}

}
