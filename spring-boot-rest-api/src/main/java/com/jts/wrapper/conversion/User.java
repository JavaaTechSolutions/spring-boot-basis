package com.jts.wrapper.conversion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	private String name;

	private int age;
	
	private Address add;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
