package com.marqueburgess.WeatherApp.WeatherApi;

import lombok.Data;

@Data
public class DataMinutes {

	private Integer time;
	private Double precipProbability;
	private String precipType;

}
