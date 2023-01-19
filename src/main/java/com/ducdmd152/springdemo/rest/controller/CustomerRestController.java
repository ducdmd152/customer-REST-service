package com.ducdmd152.springdemo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducdmd152.springdemo.entity.Customer;
import com.ducdmd152.springdemo.rest.exception.CustomerNotFoundException;
import com.ducdmd152.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	@Autowired
	private CustomerService customerService;

	// add mapping for GET /customers
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	// add mapping for GET /customers
	@GetMapping("/customers/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		Customer customer = customerService.getCustomer(customerId);
		
		if(customer == null) {
			throw new CustomerNotFoundException("Customer is not found: " + customerId);
		}
		
		return customer;
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		customer.setId(0);
		
		customerService.saveCustomer(customer);
		
		return customer;
	}
}
