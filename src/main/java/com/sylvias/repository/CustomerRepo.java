package com.sylvias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sylvias.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
