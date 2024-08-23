package com.jts.spring_boot_basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataIntitializer implements CommandLineRunner {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public void run(String... args) throws Exception {
//		Customer cust = new Customer();
//		cust.setAddress("Dummy Data");
//		cust.setName("Test Data");
//		
//		customerRepo.save(cust);
//		
//		System.out.println("Data intialize!");
		
	}

}
