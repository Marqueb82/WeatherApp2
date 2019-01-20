package com.marqueburgess.WeatherApp.WeatherApi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherApiService {

	@Value("${weatherKey}")
	private String weatherKey;

	RestTemplate restTemplate = new RestTemplate();

	public Currently getCurrently(Double latitude, Double longitude) {

		String url = "https://api.darksky.net/forecast/" + weatherKey + "/" + latitude + "," + longitude;

		WeatherAppResponse response = restTemplate.getForObject(url, WeatherAppResponse.class);
		return response.getCurrently();
	}
}
