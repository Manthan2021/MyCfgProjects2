package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Developer;

public class DeveloperApp {

	public static void main(String[] args) {
		
		ApplicationContext appCon=new ClassPathXmlApplicationContext("DevloperConfig.xml");
    	Developer factory=(Developer)appCon.getBean("d1");
    	factory.display();
    
		
	}

}
