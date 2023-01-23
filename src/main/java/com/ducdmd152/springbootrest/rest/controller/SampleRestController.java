package com.ducdmd152.springbootrest.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducdmd152.springbootrest.customer.Customer;
import com.ducdmd152.springbootrest.customer.CustomerService;
import com.ducdmd152.springbootrest.rest.exception.CustomerNotFoundException;

@RestController
@RequestMapping("/api")
public class SampleRestController {
	// add mapping for GET /customers
	@GetMapping("/sample/exception")
	public String exception() {
		boolean check = true;
		if(check) {
			throw new RuntimeException();
		}
		else {
			return "Hello";
		}
	}
}
