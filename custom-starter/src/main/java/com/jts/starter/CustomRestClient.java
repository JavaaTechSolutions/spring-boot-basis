package com.jts.starter;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient;

public class CustomRestClient {

	private static final Logger log = LoggerFactory.getLogger(CustomRestClient.class);
	
	private RestClient restClient;
	
	public CustomRestClient(@Qualifier("externalRestClient") RestClient restClient) {
		this.restClient = restClient;
	}
	
	public List<Todo> findAll() {
		return restClient.get()
				.uri("/todos")
				.retrieve()
				.body(new ParameterizedTypeReference<>() {});
	}
	
	public Todo findById(Integer id) {
		return restClient.get()
				.uri("/todos/{id}", id)
				.retrieve()
				.body(Todo.class);
	}
	
	public Todo create(Todo todo) {
		return restClient.post()
				.uri("/todos")
				.body(todo)
				.retrieve()
				.body(Todo.class);
	}
	
}
