package com.example.basic;

import org.springframework.stereotype.Service;

@Service
public class userService {

	private UserRepositoryInterface userRepository;


	public userService(UserRepositoryInterface userRepository1) {
		this.userRepository = userRepository1;
	}


	public void createUser(User user) {
		userRepository.save(user);
	}

	public void deleteUser(User user) {
		userRepository.delete(user);
	}
}