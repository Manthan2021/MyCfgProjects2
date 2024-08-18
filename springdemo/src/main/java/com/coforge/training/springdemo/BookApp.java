package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Book;

public class BookApp {

	public static void main(String[] args) {
		
		//IOC---Control of creation  of Objects is given to XML File 
		ApplicationContext appCon=new ClassPathXmlApplicationContext("BookConfig.xml");
    	Book factory=(Book)appCon.getBean("b1");
    	factory.show();
    
    	//Traditional Apparoach of creation of objects
		Book b1=new Book(10,"Balaguru swamy",500L);
		b1.show();
		
		
	}

}
