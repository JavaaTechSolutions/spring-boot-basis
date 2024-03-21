package com.jts.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@AutoConfiguration
@EnableConfigurationProperties(CustomProperties.class)
public class CustomPropertiesConfiguration {

	private static final Logger log = LoggerFactory.getLogger(CustomPropertiesConfiguration.class);
	
	private CustomProperties properties;
	
	public CustomPropertiesConfiguration(CustomProperties properties) {
		log.info("Configuring starter with properties {}", properties);
		
		this.properties = properties;
	}
	
	@Bean
	CustomRestClient customRestClient(RestClient restClient) {
		return new CustomRestClient(restClient);
	}
	
	@Bean("externalRestClient")
	RestClient restClient(RestClient.Builder builder) {
		return builder.baseUrl(properties.baseUrl())
				.build();
	}
}
