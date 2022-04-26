package com.sapient.weather.adapter;

import com.sapient.weather.vo.model.WeatherDetails;
import com.sapient.weather.vo.model.WeatherRequest;
import org.springframework.stereotype.Service;

@Service
public interface WeatherAdapterService {

    public WeatherDetails getWeatherDetails(WeatherRequest weatherRequest);
}
