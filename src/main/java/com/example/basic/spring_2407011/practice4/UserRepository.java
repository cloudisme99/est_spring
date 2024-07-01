package com.example.basic.spring_2407011.practice4;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	Map<String, User> users = new HashMap<>();


	public User getUser(String key) {
		users.put("max", new User("max@gmail.com", "Max", 20));
		return users.get("max");
	}
}