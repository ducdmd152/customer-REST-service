package com.ducdmd152.springbootrest.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	@Qualifier("customerDAOJpaImpl")
	private CustomerDAO customerDAO;
	
	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {

		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}

	@Override
	public void deleteCustomer(int theId) {
		
		customerDAO.deleteCustomer(theId);
	}
}





