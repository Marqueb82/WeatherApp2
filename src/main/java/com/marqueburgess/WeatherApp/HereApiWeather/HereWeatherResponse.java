package com.marqueburgess.WeatherApp.HereApiWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class HereWeatherResponse {

	@JsonProperty("observations")
	private Observations observations;

}
