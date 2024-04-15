package com.jts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

@Configuration
public class Config {

	@Bean
	public ObjectMapper objectMapper(YAMLFactory yamlFactory) {
        return new ObjectMapper(yamlFactory);
    } 
	
	@Bean
	public YAMLFactory yamlFactory() {
        return new YAMLFactory();
    }
}
