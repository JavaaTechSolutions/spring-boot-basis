package com.jts.multi.datasource.db3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jts.multi.datasource.db3.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

}
