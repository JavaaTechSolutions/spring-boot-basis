package com.jts.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "countries")
public class Country {
	@Id
	private long id;

	private String name;

}