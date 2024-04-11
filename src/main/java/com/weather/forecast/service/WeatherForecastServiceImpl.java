package com.weather.forecast.service;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherForecastServiceImpl implements WeatherForecastService{
	
	private RestTemplate restTemplate = new RestTemplate();
	
	String baseUrl = "https://forecast9.p.rapidapi.com/rapidapi/forecast/";
	String apiKey = "287bca9d66msh45948e63c795a44p106da9jsn4fca29393df9";
	String apiHost = "forecast9.p.rapidapi.com";

	@Override
	public Object getForecastSummaryByLocationName(String location) {
		String url = baseUrl+location+"/summary/";
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Key", apiKey);
		headers.set("X-RapidAPI-Host", apiHost);
		HttpEntity<Map<String,String>> entity = new HttpEntity<Map<String,String>>(headers);
		try {
			Object response = restTemplate.exchange(url, HttpMethod.GET,entity,Object.class);
			return response;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}

	@Override
	public Object getHourlyForecastByLocationName(String location) {
		String url = baseUrl+location+"/hourly/";
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Key", apiKey);
		headers.set("X-RapidAPI-Host", apiHost);
		HttpEntity<Map<String,String>> entity = new HttpEntity<Map<String,String>>(headers);
		try {
			Object response = restTemplate.exchange(url, HttpMethod.GET,entity,Object.class);
			return response;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}

	@Override
	public Object getForecastSummaryByCoordinates(double latitude, double longitude) {
		String url = baseUrl+latitude+"/"+longitude+"/summary/";
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Key", apiKey);
		headers.set("X-RapidAPI-Host", apiHost);
		HttpEntity<Map<String,String>> entity = new HttpEntity<Map<String,String>>(headers);
		try {
			Object response = restTemplate.exchange(url, HttpMethod.GET,entity,Object.class);
			return response;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	

}
