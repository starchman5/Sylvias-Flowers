package com.sylvias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sylvias.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{

}
