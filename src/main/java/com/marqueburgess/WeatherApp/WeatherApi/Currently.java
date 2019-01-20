package com.marqueburgess.WeatherApp.WeatherApi;

import lombok.Data;

@Data
public class Currently {

	private Integer time;
	private String summary;
	private Double precipProbability;
	private String precipType;
	private Double temperature;
	private Double dewPoint;
	private Double humidity;
	private Double windSpeed;
	private Double windGust;
	private Double visibility;

}
