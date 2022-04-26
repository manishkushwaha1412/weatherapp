package com.sapient.weather.builder;

import com.sapient.weather.vo.model.WeatherRequest;

public class WeatherRequestBuilder {

    private String country;
    private String days;
    private String auth;

    public static WeatherRequestBuilder aWeatherRequest(){
        return new WeatherRequestBuilder();
    }

    public WeatherRequestBuilder withCountry(String country){
        this.country = country;
        return this;
    }

    public WeatherRequestBuilder withDays(String days){
        this.days = days;
        return this;
    }
    public WeatherRequestBuilder withAuth(String auth){
        this.auth = auth;
        return this;
    }

    public WeatherRequest build(){
        WeatherRequest weatherRequest = new WeatherRequest();
        weatherRequest.setAuth(auth);
        weatherRequest.setDays(days);
        weatherRequest.setCountry(country);
        return weatherRequest;
    }
}
