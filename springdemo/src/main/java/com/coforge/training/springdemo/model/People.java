package com.coforge.training.springdemo.model;
//Setter Injection with help of annotations

import org.springframework.stereotype.Component;

@Component //spring automatically detects the bean file
public class People {
	
	String name;
    int age;
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
	public void display()
    {
        System.out.println("*********** Person Details **************");
        System.out.println(name+ " is "+age+ " old.");
    }
	
    
	
}
