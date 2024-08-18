package com.coforge.training.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Country {

	private String countryName;
	@Autowired
	private Capital capital;
	
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Capital getCapital() {
		return capital;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	
	
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + "]";
	}
	
	
	
	
}
