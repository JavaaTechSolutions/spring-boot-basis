package com.jts.rest.api;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Product saveProduct(Product product) {
		 return productRepository.save(product);
	}
	
	public List<Product> getAllProducts() {
		System.out.println("Executing get all product.");
        return productRepository.findAll();
    }
	
	public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
}
