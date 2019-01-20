package com.marqueburgess.WeatherApp.HereApiLocation;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Result {

	@JsonProperty("Location")
	private Location location;

}
