package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Country;


public class CountryApp {

	public static void main(String[] args) {
		
		ApplicationContext appCon=new ClassPathXmlApplicationContext("CountryConfig.xml");
    	Country factory=(Country)appCon.getBean("myCountry");
    	System.out.println(factory);
		
		
		
	}

}
