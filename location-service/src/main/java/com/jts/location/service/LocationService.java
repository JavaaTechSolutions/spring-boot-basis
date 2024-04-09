package com.jts.location.service;

import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jts.location.entity.UserLocation;
import com.jts.location.repo.UserLocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private UserLocationRepository userLocationRepo;

	public UserLocation saveUserLocation(String userName, String lat, String longitude) throws ParseException {
		WKTReader wktReader = new WKTReader();
		Geometry geometry = wktReader.read("POINT (+" + lat + " " + longitude + ")");
		
		UserLocation userLocation = new UserLocation();
		userLocation.setPoint(geometry);
		userLocation.setUserName(userName);
		
		userLocationRepo.save(userLocation);
		
		return userLocation;
	}
}
