package com.marqueburgess.WeatherApp.WeatherApi;

import java.net.URL;

import lombok.Data;

@Data
public class Alerts {

	private String title;
	private Integer time;
	private Integer expires;
	private String description;
	private URL url;
}
