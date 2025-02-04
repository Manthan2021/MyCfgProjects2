package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Person;


public class PersonApp {

	public static void main(String[] args) {
		
		ApplicationContext appCon=new ClassPathXmlApplicationContext("PersonConfig.xml");
	    
    	Person factory=(Person)appCon.getBean("person1");
    	
    	System.out.println("Person Details:");
    	System.out.println("person id:"+factory.getId());
    	System.out.println("person Name:"+factory.getName());
    	factory.showPhoneNos();

	}

}
