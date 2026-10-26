package com.spring.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.amazon.model.Product;

import com.spring.amazon.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product saveProduct) {
		return productService.saveProduct(saveProduct);

	}

	@GetMapping("/getProduct/{id}")
	public Product getProduct(@PathVariable Long id) {
		return productService.findbyProduct(id);
	}

}
