package com.jts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jts.controller.City;
import com.jts.controller.Country;
import com.jts.controller.State;
import com.jts.repository.CityRepository;
import com.jts.repository.CountryRepository;
import com.jts.repository.StateRepository;

@Service
public class DropdownService {

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private CityRepository cityRepository;

	public List<Country> getCountry() {
		return countryRepository.findAll();
	}

	public List<State> getStateByCountryId(long countryId) {
		return stateRepository.findByCountryId(countryId);
	}

	public List<City> getCityByStateId(long stateId) {
		return cityRepository.findByStateId(stateId);
	}

}
