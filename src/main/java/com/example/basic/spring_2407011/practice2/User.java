package com.example.basic.spring_2407011.practice2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {
	private String email;
	private String name;
	private int age;

}