package com.jts;

import java.io.InputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ReadindDataFromYamlFile implements CommandLineRunner {

	private ObjectMapper objectMapper;
	
	public ReadindDataFromYamlFile(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@Override
	public void run(String... args) throws Exception {
		try (InputStream stream = TypeReference.class.getResourceAsStream("/products.yaml")) {
			Order order = objectMapper.readValue(stream, Order.class);
			
			System.out.println("Order Details::"+ order);
		}
	}

}
