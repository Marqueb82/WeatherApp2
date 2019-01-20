package com.marqueburgess.WeatherApp.WeatherApi;

import lombok.Data;

@Data
public class DataDaily {

	private Integer time;
	private String summary;
	private Double precipProbability;
	private String precipType;
	private Double temperatureHigh;
	private Double temperatureLow;
	private Double dewPoint;
	private Double humidity;
	private Double windSpeed;
	private Double windGust;
	private Double visibility;

}
