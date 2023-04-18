package com.ducdmd152.springbootrest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
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
			@RequestParam(defaultValue = "3") Integer size,
			@RequestParam(required = false) String[] _sort
			) {
		if(_sort!=null ) {
			
			List<String> list = new ArrayList<String>(Arrays.asList(_sort));
			if(list.size()%2==1) {
				list.add("ASC");
			}
			List<Sort.Order> orders = new ArrayList();
			
			for(int i=0;i<list.size();i+=2) {
				Sort.Order order = new Sort.Order(
						list.get(i+1).toUpperCase().equals("DESC") ? Sort.Direction.DESC : Sort.Direction.ASC,
						list.get(i));
				
				orders.add(order);
			}
			Sort sort = Sort.by(orders);
			
			return customerService.getPageableCustomers(page.intValue(), size.intValue(), sort);
		}
		return customerService.getPageableCustomers(page.intValue(), size.intValue());
	}
}
