package com.jts.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("external.api")
public record CustomProperties(@DefaultValue("https://jsonplaceholder.typicode.com/") String baseUrl) {

}
