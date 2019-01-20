package com.marqueburgess.WeatherApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.marqueburgess.WeatherApp.HereApiLocation.HereApiService;
import com.marqueburgess.WeatherApp.HereApiWeather.HereWeatherApiService;
import com.marqueburgess.WeatherApp.WeatherApi.Currently;
import com.marqueburgess.WeatherApp.WeatherApi.WeatherApiService;

@Controller
public class WeatherController {

	@Autowired
	private HereApiService here;

	@Autowired
	private HereWeatherApiService hereWeather;

	@Autowired
	private WeatherApiService weather;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("index");
	}

	@RequestMapping("/User")
	public ModelAndView userpage() {

		return new ModelAndView("User");
	}

	@RequestMapping("/userTemp")
	public ModelAndView User(@RequestParam(name = "address", required = true) String address) {

		ModelAndView mv = new ModelAndView("userTemp");
		String safe = "2434 Kendall Detroit";
		String[] parts = address.split(" ");
		String city = parts[2];
		mv.addObject("city", city);
		Double[] location = new Double[2];

		location = here.getLatLong(address);
		Double latitude = location[0];
		mv.addObject("latitude", latitude);
		Double longitude = location[1];
		mv.addObject("longitude", longitude);

		Currently currently = weather.getCurrently(latitude, longitude);
		mv.addObject("currently", currently);

		return mv;
	}

	@RequestMapping("/General")
	public ModelAndView generalpage() {

		return new ModelAndView("General");
	}

	@RequestMapping("/generalTemp")
	public ModelAndView General(@RequestParam(name = "location", required = true) String location) {
		ModelAndView mv = new ModelAndView("generalTemp");

		String tempC = hereWeather.getGeneralWeather(location);
		Double temp = hereWeather.convertTemp(tempC);
		mv.addObject("temp", temp);
		mv.addObject("location", location);

		return mv;
	}

}
