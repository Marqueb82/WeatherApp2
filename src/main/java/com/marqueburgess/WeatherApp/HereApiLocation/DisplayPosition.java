package com.marqueburgess.WeatherApp.HereApiLocation;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DisplayPosition {

	@JsonProperty("Latitude")
	private String Latitude;
	@JsonProperty("Longitude")
	private String Longitude;

}
