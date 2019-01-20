package com.marqueburgess.WeatherApp.HereApiWeather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HereWeatherApiService {

	@Value("${hereId}")
	private String hereId;
	@Value("${hereCode}")
	private String hereCode;

	RestTemplate restTemplate = new RestTemplate();

	public String getGeneralWeather(String location) {

		String url = "https://weather.api.here.com/weather/1.0/report.json?app_id=" + hereId + "&app_code=" + hereCode
				+ "&product=observation&name=" + location;

		System.out.println(url);
		HereWeatherResponse response = restTemplate.getForObject(url, HereWeatherResponse.class);

		String temp = response.getObservations().getLocation().get(0).getObservation().get(0).getTemperature();

		System.out.println(temp);

		return temp;
	}

	public Double convertTemp(String temp) {

		Double tempToConvert = Double.valueOf(temp);
		// Conversion -> (0°C × 9/5) + 32 = 32°F
		Double tempConverted = (tempToConvert * (9 / 5)) + 32;
		return tempConverted;
	}

}
