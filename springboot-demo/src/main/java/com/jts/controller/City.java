package com.jts.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "cities")
public class City {
	@Id
	private long id;

	private String name;
	
	@Column(name = "state_id")
	private long stateId;
	
	

}