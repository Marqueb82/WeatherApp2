package com.marqueburgess.WeatherApp.HereApiLocation;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Address {

	@JsonProperty("Label")
	private String Label;
	@JsonProperty("Country")
	private String Country;
	@JsonProperty("State")
	private String State;
	@JsonProperty("County")
	private String County;
	@JsonProperty("City")
	private String City;
	@JsonProperty("District")
	private String District;
	@JsonProperty("Street")
	private String Street;
	@JsonProperty("HouseNumber")
	private String HouseNumber;
	@JsonProperty("PostalCode")
	private String PostalCode;

}
