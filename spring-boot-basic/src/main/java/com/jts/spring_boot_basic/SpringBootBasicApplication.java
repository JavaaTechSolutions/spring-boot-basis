package com.jts.spring_boot_basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootBasicApplication /* implements CommandLineRunner */ {
	
	@Autowired
	private CustomerRepo customerRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { Customer cust =
	 * new Customer(); cust.setAddress("Dummy Data"); cust.setName("Test Data");
	 * 
	 * customerRepo.save(cust);
	 * 
	 * System.out.println("Data intialize!");
	 * 
	 * }
	 */
	
	@Bean
	public CommandLineRunner start() {
		return args -> {
			Customer cust = new Customer();
			cust.setAddress("Dummy Data");
			cust.setName("Test Data");

			customerRepo.save(cust);

			System.out.println("Data intialize!");
		};
	}

}
