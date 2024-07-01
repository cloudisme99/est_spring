package com.example.basic.spring_2407011.practice2;

public class UserView {
	public void printUserDetails(User user) {
		System.out.println("User details: ");
		System.out.println("Name: " + user.getName());
		System.out.println("Email: " + user.getEmail());
	}

}