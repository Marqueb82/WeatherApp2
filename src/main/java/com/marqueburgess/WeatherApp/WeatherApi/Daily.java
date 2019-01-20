package com.marqueburgess.WeatherApp.WeatherApi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Daily {

	private String summary;
	@JsonProperty("Data")
	private List<DataDaily> data;
}
