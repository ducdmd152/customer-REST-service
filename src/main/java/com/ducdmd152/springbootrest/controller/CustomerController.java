package com.ducdmd152.springbootrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducdmd152.springbootrest.customer.Customer;
import com.ducdmd152.springbootrest.customer.CustomerService;

@RestController
@RequestMapping("/myapi/customers")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("")
	public Page<Customer> getCustomers() {
		return customerService.getCustomers();
	}
}
