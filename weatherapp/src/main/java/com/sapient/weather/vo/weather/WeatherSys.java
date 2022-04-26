package com.sapient.weather.vo.weather;

public class WeatherSys {
    private String pod;

    WeatherSys(){}

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    @Override
    public String toString() {
        return "WeatherSys{" +
                "pod='" + pod + '\'' +
                '}';
    }
}
