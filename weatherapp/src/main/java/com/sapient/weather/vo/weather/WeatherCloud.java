package com.sapient.weather.vo.weather;

public class WeatherCloud {

    private String all;

    WeatherCloud(){}

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "WeatherCloud{" +
                "all='" + all + '\'' +
                '}';
    }
}
