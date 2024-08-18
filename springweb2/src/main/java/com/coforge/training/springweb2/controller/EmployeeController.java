package com.coforge.training.springweb2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coforge.training.springweb2.model.Employee;

@Controller
public class EmployeeController {

	// model is a container for data of a application such as objects ,strings which is used to pass data/object to view
   
	@RequestMapping("/empForm")
    public String showFormForAdd(Model theModel) {
        Employee theEmp = new Employee();
        theModel.addAttribute("emp", theEmp);
        return "registerEmployee"; //it has emp obj
    }
	
	
	/*@ModelAttribute annotation is used to bind a method parameter or 
	 a method return value to a named model attribute. */
	
	/*Just like the Model interface above, ModelMap is also used to pass values to render a view.
	The advantage of ModelMap is it gives us the ability to pass a collection of values and
	 treat these values as if they were within a Map*/
	
	@RequestMapping(value="/addEmployee" ,method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("emp") Employee employee, ModelMap model) {
	
		model.addAttribute("name",employee.getName());
		model.addAttribute("contactNumber",employee.getContactNumber());
		model.addAttribute("id",employee.getId());
		
		return "viewEmployee";//three attributes
	}
	
}
