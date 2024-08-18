package com.coforge.training.springdemo.model;

import com.coforge.training.springdemo.model.Address;

//Constructor Injection with dependent object of address
//Loosely coupled class

public class Candidate {


	private int id;
    private String name;
    
    //Aggregration
    private Address a;

	public Candidate() {
		System.out.println("Candidate details");
	}

	public Candidate(int id, String name, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}
    
	public void disp()
    {
        System.out.println(id+" "+name);
        System.out.println(a);  // invoke toString() method of Address class
    }
    
	
	
	
}
