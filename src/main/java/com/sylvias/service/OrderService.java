package com.sylvias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sylvias.model.Order;
import com.sylvias.repository.OrderRepo;

@Service
public class OrderService {
	
	private final OrderRepo orderRepo;
	
	@Autowired
	public OrderService(OrderRepo orderRepo) {
		this.orderRepo = orderRepo;
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public Order addOrder(Order order) {
		
		Order savedOrder = orderRepo.save(order);
		return savedOrder;
	}
	
	public List<Order> findAllOrders() {
		return orderRepo.findAll();
	}
	
	public Order updateOrder(Order order) {
		return orderRepo.save(order);
	}
	
	public Order findOrderById(int id) {
		return orderRepo.getById(id);
	}
	
}