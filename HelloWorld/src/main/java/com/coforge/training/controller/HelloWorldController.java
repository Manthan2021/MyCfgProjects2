package com.coforge.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWorldController {

	@GetMapping("/")
	public String showIndexPage() {
		return "index";
	}
	
	@PostMapping("/test")
	public String sayHello(@RequestParam("name") String name1 ,Model model) {
		
		model.addAttribute("uname",name1);
		return "hello";
		
	}
	
}
