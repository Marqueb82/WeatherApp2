package com.marqueburgess.WeatherApp.WeatherApi;

import java.util.List;

import lombok.Data;

@Data
public class WeatherAppResponse {

	private Double latitude;
	private Double longitude;
	private String timezone;
	private Currently currently;
	private Minutely minutely;
	private Hourly hourly;
	private Daily daily;
	private List<Alerts> alerts;

}
