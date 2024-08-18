package com.coforge.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@AllArgsConstructor - is a Lombok annotation that generates a constructor with all the member variables for the Post class.
@NoArgsConstructor - is a Lombok annotation that generates an empty constructor for the Post class.
@Data - annotation generates getters and setters for the member variables of the Post class.*/

@AllArgsConstructor
@NoArgsConstructor
@Data


public class Product {

	private Long id;
	private String name;
	private String brand;
	private String madein;
	private float price;
	
}
