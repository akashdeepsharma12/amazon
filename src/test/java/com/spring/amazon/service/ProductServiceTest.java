package com.spring.amazon.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.spring.amazon.model.Product;

import com.spring.amazon.repository.ProductRepository;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

	@Mock
	private ProductRepository productRepository;

	@InjectMocks
	private ProductService productService;

	private Product product;

	@BeforeEach
	void setUp() {

		product = new Product();
		product.setId(1L);
		product.setProductId(100L);
		product.setProductName("Tablets");
		product.setProductCost(100.00);

	}

	@Test
	void testSaveProduct() {
		when(productRepository.save(product)).thenReturn(product);

		Product test = productService.saveProduct(product);
		assertNotNull(test);
		assertEquals("Tablets", test.getProductName());

	}

	@Test
	void testFindbyProductById() {
		when(productRepository.findById(product.getId())).thenReturn(Optional.of(product));

		Product test1 = productService.findbyProduct(product.getId());
		assertNotNull(test1);
		assertEquals("Tablets", test1.getProductName());
	}

}