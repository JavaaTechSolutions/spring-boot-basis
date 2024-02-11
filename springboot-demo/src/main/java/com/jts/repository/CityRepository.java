package com.jts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jts.controller.City;

public interface CityRepository extends JpaRepository<City, Long>{
	List<City> findByStateId(long id);
}
