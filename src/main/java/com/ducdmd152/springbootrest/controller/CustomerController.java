package com.ducdmd152.springbootrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ducdmd152.springbootrest.customer.Customer;
import com.ducdmd152.springbootrest.customer.CustomerService;
import com.ducdmd152.springbootrest.dto.APIPageableResponse;

@RestController
@RequestMapping("/myapi/customers")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
//	@GetMapping("")
//	public Page<Customer> getCustomers() {
//		return customerService.getCustomers();
//	}
	
	@GetMapping("")
	public APIPageableResponse<Customer> getCustomers(
			@RequestParam(defaultValue = "0") Integer page,
			@RequestParam( defaultValue = "3") Integer size
			) {
		return customerService.getPageableCustomers(page.intValue(), size.intValue());
	}
}
