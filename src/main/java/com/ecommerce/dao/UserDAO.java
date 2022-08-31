package com.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.User;
import com.ecommerce.repository.UserRepository;

@Repository
@Component
public class UserDAO {

	@Autowired
	UserRepository userrepository;

	public User authenticate(String emailId, String pwd) {
		List<User> list = userrepository.findByemailId(emailId);

		if (list.size() > 0)
			return (User) list.get(0);
		else
			return null;

	}

	public User getUserById(long id) {
		return userrepository.findById(id).get();

	}

	public User getUserByEmailId(String emailId) {
		List<User> list = userrepository.findByemailId(emailId);
		if (list.size() > 0)
			return (User) list.get(0);
		else
			return null;

	}

	public void updateUser(User user) {
		userrepository.save(user);
	}

	public List<User> getAllUsers() {
		Iterable<User> ilist = userrepository.findAll();
		List<User> list = new ArrayList<User>();
		for (User i : ilist)
			list.add(i);

		return list;
	}
}
