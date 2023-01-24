package com.ducdmd152.springbootrest.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")
public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {
	// no need to write code!
}
