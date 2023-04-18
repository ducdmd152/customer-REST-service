package com.ducdmd152.springbootrest.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.ducdmd152.springbootrest.dto.APIPageableResponse;

public interface CustomerService {

	Page<Customer> getCustomers();
	APIPageableResponse<Customer> getPageableCustomers(int page, int size);
	APIPageableResponse<Customer> getPageableCustomers(int intValue, int intValue2, Sort sort);
}
