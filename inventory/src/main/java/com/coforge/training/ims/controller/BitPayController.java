package com.coforge.training.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BitPayController {

	//Method to display bit-pay.jsp file which consumes Public Rest Api data
	@RequestMapping("/bitpay")
	public String viewBitPayPage() {
		
		return "bit-pay";
	}
	
	
	
}
