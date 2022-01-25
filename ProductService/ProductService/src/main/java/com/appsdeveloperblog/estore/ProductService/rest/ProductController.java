package com.appsdeveloperblog.estore.ProductService.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

	@PostMapping
	public String createProduct() {
		return "HTTP post is handled";
	}
	
	@GetMapping
	public String getProduct() {
		return "HTTP Get is  handled";
	}
	
	@PutMapping
	public String updateProduct() {
		return "HTTP Put is handled";
	}
	
	@DeleteMapping
	public String deleteProduct() {
		return "HTTP delete is handled";
	}
	
}
