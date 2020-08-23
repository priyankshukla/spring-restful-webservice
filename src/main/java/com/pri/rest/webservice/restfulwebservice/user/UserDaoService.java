package com.pri.rest.webservice.restfulwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	private static int userCount = 3;

	static {
		users.add(new User(1, "Ram", new Date()));
		users.add(new User(2, "Priyank", new Date()));
		users.add(new User(3, "Ruchi", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {

		for (User u : users) {
			if (u.getId() == id)
				return u;
		}
		return null;
	}

	public User saveUser(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
}
