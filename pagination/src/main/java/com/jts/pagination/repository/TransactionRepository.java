package com.jts.pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jts.pagination.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}