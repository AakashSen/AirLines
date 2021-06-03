package com.airlines.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.demo.service.AirlineService;

@RestController
public class AirLineController {

	@Autowired
	private AirlineService airlineService;

	@GetMapping("/airlines/max-city-coverage")
	public ResponseEntity<Object> getAirlnesByMaxCityCoverage() {
		return ResponseEntity.ok(airlineService.findAirlnesByMaxCityCoverage());
	}

	@GetMapping("/airlines/max-city-coverage")
	public ResponseEntity<Object> getAirlnesBydirectRoute() {
		return ResponseEntity.ok(airlineService.findAirlnesBydirectRoute());
	}

	@GetMapping("/airlines/max-city-coverage")
	public ResponseEntity<Object> getCityNamesByServingAirlines() {
		return ResponseEntity.ok(airlineService.findCityNamesByServingAirlines());
	}
}
