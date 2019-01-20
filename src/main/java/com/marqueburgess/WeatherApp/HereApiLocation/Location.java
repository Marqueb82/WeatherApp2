package com.marqueburgess.WeatherApp.HereApiLocation;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Location {

	@JsonProperty("LocationId")
	private String LocationId;
	@JsonProperty("LocationType")
	private String LocationType;
	@JsonProperty("DisplayPosition")
	private DisplayPosition displayPosition;
	@JsonProperty("Address")
	private Address address;

}
