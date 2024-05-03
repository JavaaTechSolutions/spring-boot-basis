package com.jts.order;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	private static final Logger logger = LogManager.getLogger(OrderController.class);

	@GetMapping("/getPaymentDetails")
	public String getPaymentDetails() {
		logger.debug("Debug log message");
		logger.info("Info log message");
		logger.error("Error log message");
		logger.warn("Warn log message");
		logger.trace("Trace log message");

		return "Payment details fetched succesfully.";
	}
}
