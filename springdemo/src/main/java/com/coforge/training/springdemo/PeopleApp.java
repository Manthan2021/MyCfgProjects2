package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.coforge.training.springdemo.model.People;
import com.coforge.training.springdemo.model.PeopleConfig;


public class PeopleApp {

	public static void main(String[] args) {
	
ApplicationContext appCon=new AnnotationConfigApplicationContext(PeopleConfig.class);
	    
    	People factory=(People)appCon.getBean("people",People.class);
         factory.display();
	}

}
