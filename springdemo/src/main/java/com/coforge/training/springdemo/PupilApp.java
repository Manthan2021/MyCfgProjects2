package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Person;
import com.coforge.training.springdemo.model.Pupil;

public class PupilApp {

	public static void main(String[] args) {
ApplicationContext appCon=new ClassPathXmlApplicationContext("PupilConfig.xml");
	    
    	Pupil factory=(Pupil)appCon.getBean("pupil1");
    	
    	System.out.println("Pupil Details:");
    	System.out.println("pupil id:"+factory.getId());
    	System.out.println("pupil Name:"+factory.getName());
    	factory.showHobbies();
    

	}

}
