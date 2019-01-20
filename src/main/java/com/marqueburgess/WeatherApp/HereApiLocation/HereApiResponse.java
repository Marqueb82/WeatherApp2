package com.marqueburgess.WeatherApp.HereApiLocation;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class HereApiResponse {

	@JsonProperty("Response")
	private Response response;

}
