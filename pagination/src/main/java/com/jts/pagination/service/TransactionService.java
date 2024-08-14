package com.jts.pagination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.jts.pagination.entity.Transaction;
import com.jts.pagination.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;

	public Page<Transaction> getTransactiopns(int pageNo, int pageSize) {
		return transactionRepository.findAll(PageRequest.of(pageNo, pageSize));
	}
}
