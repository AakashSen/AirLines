package com.airlines.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.airlines.demo.entity.AirLines;

public interface AirLinesRepository extends JpaRepository<Long, AirLines>{

	@Query(value = "Select test.airline from (Select ar.airline, ar.src_airport, ar.dest_airport, count(ar) as cityCount from airlines ar group by airline, src_airport, dest_airport)test " + 
			"order by cityCount desc limit 3", nativeQuery = true)
	public List<String> findAilnesByMaxCityCoverage();

	@Query("Select ar.airline from AirLines ar where stops = 0 limit 3")
	public List<String> findAilnesBydirectRoute();

	@Query(value = "Select test.src_airport, test.dest_airport, test.airLinesSrvCount from (Select ar.src_airport, ar.dest_airport, count(ar) as airLinesSrvCount from airlines ar group by src_airport, dest_airport)test " + 
			"order by cityCount desc limit 10", nativeQuery = true)
	public List<Object[]> findCityNamesByServingAirlines();
}
