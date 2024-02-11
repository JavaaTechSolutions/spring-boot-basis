package com.jts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jts.controller.State;

public interface StateRepository extends JpaRepository<State, Long>{
	List<State> findByCountryId(long id);
}
