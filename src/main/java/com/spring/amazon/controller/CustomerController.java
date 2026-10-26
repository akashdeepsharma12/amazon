package com.spring.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.amazon.model.Customer;
import com.spring.amazon.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer saveCustomer) {
		return customerService.saveCustomer(saveCustomer);

	}

	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return customerService.findbyCustomer(id);
	}

}
