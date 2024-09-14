package com.jts.wrapper;

import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class ObjectWrapperExample {

	public static void main(String[] args) throws JsonProcessingException {
		Employee emp = new Employee();
		emp.setName("John");
		emp.setAge(30);
		emp.setBirthDate(LocalDate.now());

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		String jsosnString = mapper.writeValueAsString(emp);

		System.out.println("Json String::" + jsosnString);
		
		Employee emp1 = mapper.readValue(jsosnString, Employee.class);
		
		System.out.println("Employee Onject::" + emp1);

	}

}
