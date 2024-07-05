package com.jts.multi.datasource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jts.multi.datasource.db3.model.Order;
import com.jts.multi.datasource.db3.repository.OrderRepo;

@Service
public class OrderService {

	@Autowired
	private OrderRepo orderRepository;

	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}
}
