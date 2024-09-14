package com.jts.wrapper.mapstruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
	private int id;

	private String name;
	
	private Address address;
}
