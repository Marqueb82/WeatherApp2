package com.marqueburgess.WeatherApp.HereApiLocation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Response {

	@JsonProperty("View")
	private List<View> view;

}
