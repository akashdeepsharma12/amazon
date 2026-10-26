package com.spring.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.amazon.model.Customer;
import com.spring.amazon.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {

		try {
			return customerRepository.save(customer);

		} catch (Exception exception) {
			return null;
		}

	}

	public Customer findbyCustomer(Long id) {

		try {
			return customerRepository.findById(id).orElse(null);
		} catch (Exception exception) {
			return null;
		}

	}

}
