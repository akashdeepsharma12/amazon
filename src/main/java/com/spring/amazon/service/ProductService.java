package com.spring.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.amazon.model.Product;

import com.spring.amazon.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {

		try {
			return productRepository.save(product);

		} catch (Exception exception) {
			return null;
		}

	}

	public Product findbyProduct(Long id) {

		try {
			return productRepository.findById(id).orElse(null);
		} catch (Exception exception) {
			return null;
		}

	}

}
