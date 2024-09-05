package com.jts.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

	@Autowired
	private MessagePublisher messagePublisher;
	
	@GetMapping("/publish")
	public String pushMsgIntoQueue() {
		messagePublisher.sendMsg();
		return "Sucess";
	}
}
