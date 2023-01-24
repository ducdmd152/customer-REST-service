package com.ducdmd152.springbootrest.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {
	// no need to write code!
}
