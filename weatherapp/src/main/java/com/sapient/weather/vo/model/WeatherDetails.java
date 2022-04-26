package com.sapient.weather.vo.model;

import com.sapient.weather.vo.city.City;
import com.sapient.weather.vo.weather.WeatherOnDay;

import java.util.List;

public class WeatherDetails {
    private Long cod;
    private String message;
    private int dayCount;
    private List<WeatherOnDay> list;
    private City city;

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public List<WeatherOnDay> getList() {
        return list;
    }

    public void setList(List<WeatherOnDay> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "WeatherDetails{" +
                "cod=" + cod +
                ", message='" + message + '\'' +
                ", dayCount=" + dayCount +
                ", list=" + list +
                ", city=" + city +
                '}';
    }
}
