package com.coforge.training.springweb2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	  @RequestMapping("/login")
	    public String showLoginForm()
	    {
	        return "login";  //return view name
	    }
@RequestMapping("/checkUser")
public String checkUser(HttpServletRequest req,Model m) {
	
	String uName=req.getParameter("uname");
	String password=req.getParameter("psw");
	
	if(password.equals("testing"))
    {
        String msg="Welcome "+uName;
        m.addAttribute("message", msg);
        return "success";
    }
    else
    {
        String msg="Sorry "+uName+". You entered Incorrect Password.";
        m.addAttribute("message", msg);
        return "errorPage";
    }
	
	
}

}
