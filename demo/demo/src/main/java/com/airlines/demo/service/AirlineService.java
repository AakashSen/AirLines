package com.airlines.demo.service;

import java.util.List;

public interface AirlineService {

	public List<String> findAirlnesByMaxCityCoverage();

	public List<String> findAirlnesBydirectRoute();

	public List<Object[]> findCityNamesByServingAirlines();

}
