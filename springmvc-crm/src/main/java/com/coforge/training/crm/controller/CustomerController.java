package com.coforge.training.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coforge.training.crm.model.Customer;
import com.coforge.training.crm.service.CustomerService;

@Controller
@RequestMapping("/customer") //class level Mapping
public class CustomerController {
 
	@Autowired
	private CustomerService customerService;
	
	
	
	//It happens when database Intracts
	//Request ->Front Controller-> controller-> service->Dao->database
	//databse-> dao->service- >controller->FrontController->view(Response)

	//to display only view
	//Request ->Front Controller->Controller -> Views(Response)
	
	
	
	@GetMapping("/showform")//method level mapping
	public String showFormForAdd(ModelMap theModel) {
	Customer theCustomer = new Customer();
	theModel.addAttribute("customer", theCustomer);
	
	return "customer-form";//Return view& customer object
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
	customerService.saveCustomer(theCustomer);
	return "redirect:/customer/list";//Redirection to list
	}
	
	
	
	
	@GetMapping("/list") // @GetMapping - method level , default GET method
	public String listCustomers(ModelMap theModel) {
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers"; // customers attributes is added to view & returned
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("customerId") int theId,	ModelMap theModel) {
		Customer theCustomer = customerService.getCustomer(theId);
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
	customerService.deleteCustomer(theId);
	return "redirect:/customer/list";
	}
	
	
	
	
	
	
}
