package com.example.basic.day240715.practice1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String username;
	private String email;
	private boolean admin;
	private boolean person;

}