package com.coforge.training.springdemo.model;
import com.coforge.training.springdemo.model.Department;
public class Faculty {
	private int fId;
	private String fName;
	
	private Department dept;

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public void display() {
		
		System.out.println(fId+" "+fName);
		System.out.println(dept.getDeptName());
		
		
	}
	

}
