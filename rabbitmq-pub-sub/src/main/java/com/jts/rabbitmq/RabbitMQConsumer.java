package com.jts.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {

	@RabbitListener(queues = "myQueue")
	public void receiveMessage(String message) {
		System.out.println("Received message: " + message);
	}
}
