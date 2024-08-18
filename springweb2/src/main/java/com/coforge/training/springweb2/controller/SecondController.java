package com.coforge.training.springweb2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SecondController {
@RequestMapping("/BackHome")
	
	public String showHelloWorld() {
		
		return "Home";
	}

}
