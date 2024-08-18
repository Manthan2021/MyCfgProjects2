package com.coforge.training;

import org.springframework.web.client.RestTemplate;

import com.coforge.training.model.Product;

public class ConsumeRestJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//RestTemplate is used to consume RestfulWebServices.It uses HttpServer using Restful Principles
		RestTemplate restTemplate=new RestTemplate();
		//It retrieves an entity using HTTP GET method on the given URL.
		
		Product p=restTemplate.getForObject("http://localhost:8086/ims/api/products/{id}", Product.class,5);
		
		System.out.println("Product Id: "+ p.getId());
		System.out.println("Product Id: "+ p.getName());
		System.out.println("Product Id: "+ p.getMadein());
		System.out.println("Product Id: "+ p.getPrice());


		
		
		
		

	}

}
