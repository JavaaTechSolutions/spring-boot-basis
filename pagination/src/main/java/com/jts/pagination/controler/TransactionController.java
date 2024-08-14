package com.jts.pagination.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jts.pagination.entity.Transaction;
import com.jts.pagination.service.TransactionService;

@RestController
@RequestMapping("/api")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@GetMapping("transactions")
	public ResponseEntity<Page<Transaction>> getTransactions(@RequestParam(defaultValue = "0") int pageNo,
			@RequestParam(defaultValue = "10") int pageSize) {

		Page<Transaction> txns = transactionService.getTransactiopns(pageNo, pageSize);

		return ResponseEntity.ok(txns);
	}
}
