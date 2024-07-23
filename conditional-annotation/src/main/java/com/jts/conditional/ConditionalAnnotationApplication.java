package com.jts.conditional;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConditionalAnnotationApplication implements CommandLineRunner {
	
	@Autowired
	private ApplicationContext appContext;

	public static void main(String[] args) {
		SpringApplication.run(ConditionalAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] beans = appContext.getBeanDefinitionNames();
		Arrays.sort(beans);

		for (String bean : beans) {
			System.out.println(bean);
		}
	}

}
