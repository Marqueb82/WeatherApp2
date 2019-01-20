package com.marqueburgess.WeatherApp.HereApiWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Observation {

	@JsonProperty("temperature")
	private String temperature;
	@JsonProperty("temperatureDesc")
	private String temperatureDesc;
	@JsonProperty("highTemperature")
	private String highTemperature;
	@JsonProperty("lowTemperature")
	private String lowTemperature;

}
