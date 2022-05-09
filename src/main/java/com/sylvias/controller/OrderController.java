package com.sylvias.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sylvias.model.Order;
import com.sylvias.service.OrderService;

@RestController
@RequestMapping("/Order")
public class OrderController {
	
	private final OrderService orderService;
	
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Order>> getAllOrders(){
		List<Order> orders = orderService.findAllOrders();
		return new ResponseEntity<>(orders, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable("id") int id){
		Order order = orderService.findOrderById(id);
		return new ResponseEntity<>(order, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Order> addOrder(@RequestBody Order order){
		Order newOrder = orderService.addOrder(order);
		return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order){
		Order updatedOrder = orderService.updateOrder(order);
		return new ResponseEntity<>(updatedOrder, HttpStatus.OK);
	}

}