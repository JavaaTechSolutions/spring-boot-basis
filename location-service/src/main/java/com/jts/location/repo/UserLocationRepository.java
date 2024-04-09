package com.jts.location.repo;

import java.util.List;

import org.locationtech.jts.geom.Geometry;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jts.location.entity.UserLocation;

public interface UserLocationRepository extends CrudRepository<UserLocation, Integer> {

	@Query(value = "select point from UserLocation where userName = :userName")
	Geometry findCoordinateByUsername(String userName);
	
	@Query(value = "select user_name, ST_Distance_Sphere(ST_GeomFromText(:geometry), coordinate) / 1000 as distance "
			+ "from user_location "
			+ "HAVING user_name != :userName and distance < 200 "
			+ "order by distance", nativeQuery = true)
	List<Object[]> findAlltheLocation(@Param("geometry") String geometry, @Param("userName") String userName);

}
