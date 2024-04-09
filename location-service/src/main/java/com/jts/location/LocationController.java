package com.jts.location;

import java.util.List;

import org.locationtech.jts.io.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jts.location.entity.MatchingUserDetailsDTO;
import com.jts.location.entity.UserLocation;
import com.jts.location.service.FindNearestUserService;
import com.jts.location.service.LocationService;

@RestController
@RequestMapping("/api")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@Autowired
	private FindNearestUserService nearestService;

	@GetMapping("/saveUserLocation")
	public String saveLocation(@RequestParam String userName, @RequestParam String lat,
			@RequestParam String longitude) throws ParseException {
		UserLocation userLocation = locationService.saveUserLocation(userName, lat, longitude);

		System.out.println("User location details saved successfully with id::" + userLocation.getId());

		return "User location details saved successfully.";
	}
	
	@GetMapping("/findNearestLocation")
	public List<MatchingUserDetailsDTO> findNearestLocation(String userName) {
		return nearestService.findNearestlocatio(userName);
	}
}
