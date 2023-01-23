package com.ducdmd152.springbootrest.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional // remove since JpaRepository provide already
public class CustomerServiceSpringJPAImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerJpaRepository customerJpaRepository;
	
	@Override
	public List<Customer> getCustomers() {
		return customerJpaRepository.findAll();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {

		customerJpaRepository.save(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		Optional<Customer> result = customerJpaRepository.findById(theId);
		Customer customer = null;
		
		if(result.isPresent()) {
			customer =  result.get();
		}
		else {
			// we didn't find the employee
//			throw new RuntimeException("Did not find employee id - " + theId);
			// do nothing to return null
		}
		return customer;
	}

	@Override
	public void deleteCustomer(int theId) {
		
		customerJpaRepository.deleteById(theId);
	}
}





