package com.weather.forecast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weather.forecast.service.WeatherForecastService;

@RestController
public class WeatherForecastController {
	
	@Autowired
	private WeatherForecastService weatherForecastService;
	
	@GetMapping("/{location}/summary")
	public Object getForecastSummaryByLocation(@PathVariable String location){
		Object response = weatherForecastService.getForecastSummaryByLocationName(location);
		if(response != null) {
			return response;
		}
		return "Error in fetching details";
	}
	
	@GetMapping("/{location}/hourly")
	public Object getHourlyForecastByLocation(@PathVariable String location) {
		Object response = weatherForecastService.getHourlyForecastByLocationName(location);
		if(response != null) {
			return response;
		}
		return "This is the paid API, which requires premium subscription";
	}
	
	@GetMapping("/{latitude}/{longitude}/summary")
	public Object getForecastSummaryByCoordinates(@PathVariable double latitude, @PathVariable double longitude) {
		Object response = weatherForecastService.getForecastSummaryByCoordinates(latitude, longitude);
		if(response != null) {
			return response;
		}
		return "Error in fetching details";
	}

}
