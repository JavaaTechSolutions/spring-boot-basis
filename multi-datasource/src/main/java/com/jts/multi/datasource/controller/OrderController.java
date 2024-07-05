package com.jts.multi.datasource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jts.multi.datasource.db3.model.Order;
import com.jts.multi.datasource.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/saveOrder")
	public ResponseEntity<Order> save(@RequestBody Order order) {
		Order myOrder = orderService.saveOrder(order);
		return new ResponseEntity<>(myOrder, HttpStatus.OK);
	}

}
