package com.marqueburgess.WeatherApp.HereApiLocation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class View {

	@JsonProperty("Result")
	private List<Result> result;

}
