package com.ducdmd152.springbootrest.customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOJpaImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Customer> getCustomers() {

		// get the current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);

		// create a query ... sort by last name
		TypedQuery<Customer> theQuery = entityManager.createQuery("from Customer order by lastName", Customer.class);

		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();

		// return the results
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		System.out.println("Calling...");
		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theCustomer);
//		entityManager.merge(theCustomer);

	}

	@Override
	public Customer getCustomer(int theId) {

		// get the current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);

		// now retrieve/read from database using the primary key
//		Customer theCustomer = currentSession.get(Customer.class, theId);
		Customer theCustomer = entityManager.find(Customer.class, theId);

		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {

		// get the current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);

		// delete object with primary key
//		Query theQuery = 
//				currentSession.createQuery("delete from Customer where id=:customerId");
//		theQuery.setParameter("customerId", theId);

		Query theQuery = 
				entityManager.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);

		theQuery.executeUpdate();
	}

}
