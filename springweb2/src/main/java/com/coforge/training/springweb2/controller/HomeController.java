package com.coforge.training.springweb2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/myHome", method = RequestMethod.GET)
    public String showHome(ModelMap model) {
       model.addAttribute("user", "Manthan");
       model.addAttribute("d", new java.util.Date());
           return "Home";  // return model(data) + view name
       }
	
	
@RequestMapping("/hello")
	
	public String showHelloWorld() {
		
		return "second";
	}
	
}
