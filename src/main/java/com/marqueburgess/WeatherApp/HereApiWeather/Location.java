package com.marqueburgess.WeatherApp.HereApiWeather;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Location {

	@JsonProperty("observation")
	private List<Observation> observation;
}
