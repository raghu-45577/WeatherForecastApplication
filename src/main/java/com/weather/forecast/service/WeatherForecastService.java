package com.weather.forecast.service;

public interface WeatherForecastService {
	
	Object getForecastSummaryByLocationName(String location);
	Object getHourlyForecastByLocationName(String location);
	Object getForecastSummaryByCoordinates(double latitude,double longitude);

}
