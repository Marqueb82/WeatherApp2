package com.marqueburgess.WeatherApp.HereApiLocation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HereApiService {

	@Value("${hereId}")
	private String hereId;
	@Value("${hereCode}")
	private String hereCode;

	RestTemplate restTemplate = new RestTemplate();

	public Double[] getLatLong(String address) {

		String[] parts = address.split(" ");
		String numbers = parts[0];
		String street = parts[1];
		String city = parts[2];

		String url = "https://geocoder.api.here.com/6.2/geocode.json\r\n?app_id=" + hereId + "&app_code=" + hereCode
				+ "&searchtext=" + numbers + "+" + street + "+" + city;

		HereApiResponse response = restTemplate.getForObject(url, HereApiResponse.class);

		System.out.println(url);

		Double[] latLong = {
				Double.parseDouble(response.getResponse().getView().get(0).getResult().get(0).getLocation()
						.getDisplayPosition().getLatitude()),
				Double.parseDouble(response.getResponse().getView().get(0).getResult().get(0).getLocation()
						.getDisplayPosition().getLongitude()) };

		return latLong;

	}

}
