package com.jts.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisher {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendMsg() {
		rabbitTemplate.convertAndSend("myQueue", "Hello, RabbitMQ!");
		System.out.println("Msg sending is done successfully.");
	}
}
