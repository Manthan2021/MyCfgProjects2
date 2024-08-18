package HibernateAssignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home(Model themodel) {

		
		return "index";
	}

	@RequestMapping("/add-book")
	public String add_book() {
		return "add_book_form";
	}
}
