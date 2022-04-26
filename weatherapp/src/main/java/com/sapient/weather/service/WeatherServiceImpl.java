package com.sapient.weather.service;

import com.sapient.weather.adapter.WeatherAdapterService;
import com.sapient.weather.builder.WeatherRequestBuilder;
import com.sapient.weather.converter.WeatherConverter;
import com.sapient.weather.vo.model.WeatherDetails;
import com.sapient.weather.vo.model.WeatherRequest;
import com.sapient.weather.vo.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl extends AbstractService implements WeatherService {

    @Autowired
    private WeatherAdapterService weatherAdapterService;

    @Autowired
    private WeatherConverter weatherConverter;

    @Override
    public WeatherResponse getWeatherDetails(String country, String days, String authToken) {
       WeatherRequest weatherRequest = WeatherRequestBuilder.aWeatherRequest().withAuth(authToken).withCountry(country).withDays(days).build();
       try {
           WeatherDetails weatherDetails = weatherAdapterService.getWeatherDetails(weatherRequest);

           // Process Weather Details
           WeatherResponse weatherResponse = weatherConverter.processWeatherResponse(weatherDetails);
           logger.info("Response Received from converter :: {} ", weatherResponse);
           return weatherResponse;
       }catch(Exception e){
           logger.error("Error Found : {}  ", e.getMessage());
           return null;
       }
    }
}
