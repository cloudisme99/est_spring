package com.example.basic.day240709.practice2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("name", "good");
		return "index";
	}

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("style1", "background-color:green; color:white;");
		model.addAttribute("word1", "SpringBoot");
		model.addAttribute("word2", "World!");
		model.addAttribute("type", "button");
		model.addAttribute("word3", "START!");
		return "hello";
	}
}

