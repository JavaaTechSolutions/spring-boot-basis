package com.jts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jts.service.DropdownService;

@RestController
@CrossOrigin("http://localhost:4200")
public class DropdownController {

	@Autowired
	private DropdownService dropdownService;
	
	@GetMapping("/getCountry")
	public List<Country> getCountry() {
		return dropdownService.getCountry();
	}

	@GetMapping("/getStateByCountryId")
	public List<State> getStateByCountryId(@RequestParam(name = "country_id") long countryId) {
		return dropdownService.getStateByCountryId(countryId);
	}

	@GetMapping("/getCityByStateId")
	public List<City> getCityByStateId(@RequestParam(name = "state_id") long stateId) {
		return dropdownService.getCityByStateId(stateId);
	}

}
