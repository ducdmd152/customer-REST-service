package com.ducdmd152.springbootrest.customer;

import org.springframework.data.domain.Page;

import com.ducdmd152.springbootrest.dto.APIPageableResponse;

public interface CustomerService {

	Page<Customer> getCustomers();
	APIPageableResponse<Customer> getPageableCustomers();
}
