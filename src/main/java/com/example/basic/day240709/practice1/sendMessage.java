package com.example.basic.day240709.practice1;

import org.springframework.stereotype.Component;

@Component
public class sendMessage implements Message {

	@Override
	public void print() {
		System.out.println("Hello World");
	}

}
