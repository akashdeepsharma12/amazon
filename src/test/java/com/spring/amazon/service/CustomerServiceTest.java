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

import com.spring.amazon.model.Customer;
import com.spring.amazon.repository.CustomerRepository;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

	@Mock
	private CustomerRepository customerRepository;

	@InjectMocks
	private CustomerService customerService;

	private Customer customer;

	@BeforeEach
	void setUp() {

		customer = new Customer();
		customer.setId(1L);
		customer.setCustomerName("ManiBhai");
		customer.setCustomeContactNumber(249365412);
		customer.setCustomerEmail("ManiBhai@ioloi.com");
	}

	@Test
	void testSaveCustomer() {
		when(customerRepository.save(customer)).thenReturn(customer);

		Customer test = customerService.saveCustomer(customer);
		assertNotNull(test);
		assertEquals("ManiBhai", test.getCustomerName());

	}

	@Test
	void testFindbyCustomerById() {
		when(customerRepository.findById(customer.getId())).thenReturn(Optional.of(customer));

		Customer test1 = customerService.findbyCustomer(customer.getId());
		assertNotNull(test1);
		assertEquals("ManiBhai", test1.getCustomerName());
	}

}
