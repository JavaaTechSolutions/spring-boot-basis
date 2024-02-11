package com.jts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jts.controller.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
