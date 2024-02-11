package com.jts.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "states")
public class State {
	@Id
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "country_id")
	private long countryId;

	@Column(name = "country_code")
	private String countryCode;

}