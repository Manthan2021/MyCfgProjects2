package com.coforge.training.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@JacksonXmlRootElement
public class Employee {
private String name;
private String designation;


public Employee() {
	// TODO Auto-generated constructor stub
}


public Employee(String name, String designation) {
	super();
	this.name = name;
	this.designation = designation;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}


	
	
	
}
