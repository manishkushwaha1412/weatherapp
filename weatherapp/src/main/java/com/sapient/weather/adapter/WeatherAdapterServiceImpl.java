package com.sapient.weather.adapter;

import com.sapient.weather.converter.WeatherConverter;
import com.sapient.weather.service.AbstractService;
import com.sapient.weather.vo.model.WeatherDetails;
import com.sapient.weather.vo.model.WeatherRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherAdapterServiceImpl extends AbstractService implements WeatherAdapterService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WeatherConverter weatherConverter;

    @Override
    public WeatherDetails getWeatherDetails(WeatherRequest weatherRequest) {
        String externalRequestURL = weatherConverter.constructWeatherURL(weatherRequest);
        ResponseEntity<WeatherDetails> responseEntity = restTemplate.getForEntity(externalRequestURL, WeatherDetails.class);
        HttpStatus httpStatus =  responseEntity.getStatusCode();
        if(httpStatus == HttpStatus.OK){
            return responseEntity.getBody();
        }
        return null;
    }
}
