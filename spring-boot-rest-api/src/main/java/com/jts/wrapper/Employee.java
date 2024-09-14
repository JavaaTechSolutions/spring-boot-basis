package com.jts.wrapper;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(value = Include.NON_EMPTY)
public class Employee {
	
	private String name;
	
	private int age;
	
	@JsonSerialize(using = CustomSerializer.class)
//	@JsonDeserialize
	private LocalDate birthDate;
	
	private String address;
}
