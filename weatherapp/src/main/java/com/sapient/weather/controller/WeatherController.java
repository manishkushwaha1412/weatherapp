package com.sapient.weather.controller;

import com.sapient.weather.exception.RecordNotFoundException;
import com.sapient.weather.service.AbstractService;
import com.sapient.weather.service.WeatherService;
import com.sapient.weather.vo.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/weather/")
@CrossOrigin("*")
public class WeatherController extends AbstractService {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("forecast")
    public ResponseEntity<Object> getWeatherDetails(@RequestHeader(value = "Authorization") String authorization,
                                                             @RequestParam("q") String country,
                                                             @RequestParam("cnt") String daysCount) {

        if(authorization == null){
            throw new RecordNotFoundException("Authorization Not Found");
        }
        WeatherResponse weatherResponse = weatherService.getWeatherDetails(country, daysCount, authorization);
        if (weatherResponse == null) {
            throw new RecordNotFoundException("Record Not Found !!");
        }
        return new ResponseEntity<>(weatherResponse, HttpStatus.OK);
    }
}
