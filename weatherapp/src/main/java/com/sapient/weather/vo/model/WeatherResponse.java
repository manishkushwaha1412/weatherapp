package com.sapient.weather.vo.model;

import com.sapient.weather.vo.weather.WeatherResponseInfo;

import java.util.List;

public class WeatherResponse {

    private String city;
    private String country;

    private List<WeatherResponseInfo> weathers;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<WeatherResponseInfo> getWeathers() {
        return weathers;
    }

    public void setWeathers(List<WeatherResponseInfo> weathers) {
        this.weathers = weathers;
    }
}
