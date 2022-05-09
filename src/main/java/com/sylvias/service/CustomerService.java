package com.sylvias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sylvias.model.Customer;
import com.sylvias.repository.CustomerRepo;

@Service
public class CustomerService {
	
	private final CustomerRepo customerRepo;
	
	@Autowired
	public CustomerService(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public Customer addCustomer(Customer customer) {
		
		Customer savedCustomer = customerRepo.save(customer);
		return savedCustomer;
	}
	
	public List<Customer> findAllCustomers() {
		return customerRepo.findAll();
	}
	
	public Customer updateCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public Customer findCustomerById(int id) {
		return customerRepo.getById(id);
	}
	
	public List<Customer> findCustomerByPhone(Sort cust_phone){
		return customerRepo.findAll(cust_phone);
	}

}
