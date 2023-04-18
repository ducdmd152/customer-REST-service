package com.ducdmd152.springbootrest.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ducdmd152.springbootrest.dto.APIPageableResponse;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerJpaRepository customerJpaRepository;
	
	@Override
	public Page<Customer> getCustomers() {
		int pageNumber = 2;
		int size = 4;
		Page<Customer> customerPage = customerJpaRepository.findAll(PageRequest.of(pageNumber, size));
		
		return customerPage;
	}
	
	@Override
	public APIPageableResponse<Customer> getPageableCustomers(int page, int size) {
		Page<Customer> customerPage = customerJpaRepository.findAll(
				PageRequest.of(page, size, Sort.by("id").descending())
				);
		
		return new APIPageableResponse<Customer>(customerPage);
	}
	
	@Override
	public APIPageableResponse<Customer> getPageableCustomers(int page, int size, Sort sort) {
		Page<Customer> customerPage = customerJpaRepository.findAll(
				PageRequest.of(page, size, sort)
				);
		
		return new APIPageableResponse<Customer>(customerPage);
	}


}
