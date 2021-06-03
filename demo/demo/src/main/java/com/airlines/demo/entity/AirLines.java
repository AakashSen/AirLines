package com.airlines.demo.entity;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table; 

@Entity
@Table
public class AirLines {

	@Id
	@Column(name = "airline_id")
	private Long airlineID;

	@Column(name = "airline")
	private String airline;

	@Column(name = "src_airport")
	private String srcAirport;

	@Column(name = "src_airport_id")
	private Long srcAirportID;

	@Column(name = "dst_airport")
	private String destAirport;

	@Column(name = "dst_airport_id")
	private Long dstAirportID;

	@Column(name = "code_share")
	private String codeshare;

	@Column(name = "stops")
	private Long stops;

	@Column(name = "equipment")
	private String equipment;

}
