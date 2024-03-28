package com.jts.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/getProductDetails")
	public String getPaymentDetails() {
		return "Product details fetched succesfully.";
	}
}
