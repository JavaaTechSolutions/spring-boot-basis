package com.jts.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

//	@Bean
//	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//		.route(r -> r.path("/product/**")
//				.uri("http://localhost:8081/"))
//		
//		.route(r -> r.path("/order/**")
//				.uri("http://localhost:8082/"))
//		.build();
//		
//	}
}
