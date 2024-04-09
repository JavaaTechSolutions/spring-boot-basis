package com.jts.location.service;

import java.util.ArrayList;
import java.util.List;

import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.WKTWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jts.location.entity.MatchingUserDetailsDTO;
import com.jts.location.repo.UserLocationRepository;

@Service
public class FindNearestUserService {

	@Autowired
	private UserLocationRepository userLocationRepository;

	public List<MatchingUserDetailsDTO> findNearestlocatio(String userName) {
		Geometry geometry = userLocationRepository.findCoordinateByUsername(userName);

		WKTWriter reader = new WKTWriter();
		String point = reader.write(geometry);

		List<Object[]> locationsDetails = userLocationRepository.findAlltheLocation(point, userName);

		List<MatchingUserDetailsDTO> matchingUserDetailsDTOs = new ArrayList<>();

		for (Object[] objects : locationsDetails) {
			MatchingUserDetailsDTO matchingUserDetailsDTO = new MatchingUserDetailsDTO();
			matchingUserDetailsDTO.setDisplayName((String) objects[0]);
			matchingUserDetailsDTO.setDistance((double) objects[1] + " km");

			matchingUserDetailsDTOs.add(matchingUserDetailsDTO);
		}

		return matchingUserDetailsDTOs;
	}
}
