package com.sapient.weather.service;

import com.sapient.weather.vo.model.WeatherResponse;
import org.springframework.stereotype.Service;

@Service
public interface WeatherService {


    WeatherResponse getWeatherDetails(String country, String days, String authToken);

}
