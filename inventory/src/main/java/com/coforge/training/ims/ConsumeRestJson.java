package com.coforge.training.ims;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.coforge.training.ims.model.BitPay;
import com.coforge.training.ims.model.Post;
import com.coforge.training.ims.model.Product;

public class ConsumeRestJson {

	public static void main(String[] args) {
		
		
		//Rest Template used to consume Restful web services.....communicate with HttpServer using Restful principles.
		RestTemplate restTemplate=new RestTemplate();
		
		//It retrieves an entity using HTTP GET method on the given URL.
		
		Product p=restTemplate.getForObject("http://localhost:8086/ims/api/products/{id}", Product.class,5);
			System.out.println("Product Id:"+p.getId());
			System.out.println("Product Name:"+p.getName());
			System.out.println("Product MadeIn:"+p.getMadein());
			System.out.println("Product Price:"+p.getPrice());
		
			System.out.println("****************************************");
			/*
			 * List<BitPay> bpay=(List<BitPay>)
			 * restTemplate.getForObject("https://bitpay.com/api/rates", BitPay.class);
			 * 
			 * for(BitPay bp : bpay) { System.out.println("Code:"+bp.getCode()); }
			 */
			
			Post p1=restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts{id}",Post.class,5);
			System.out.println("Post User Id:"+p1.getUserId());
			System.out.println("Post User Id:"+p1.getId());
			System.out.println("Post User Id:"+p1.getTitle());
			System.out.println("Post User Id:"+p1.getBody());
	}

}
