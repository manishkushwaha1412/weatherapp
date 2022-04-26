package com.sapient.weather.vo.weather;

import com.sapient.weather.vo.weather.WeatherResponseData;

import java.util.Map;


public class WeatherResponseInfo {

    private String date;
    private Map<String, Double> temperature;
    private String rainInfo;
    private double windSpeed;
    private String isThunderstorm; // I don't see any thunderstorm related output in the JSON response however keeping it here

    private String temMessage;
    private String thunderMessage;
    private String windMessage;

    public String getTemMessage() {
        return temMessage;
    }

    public void setTemMessage(String temMessage) {
        this.temMessage = temMessage;
    }

    public String getThunderMessage() {
        return thunderMessage;
    }

    public void setThunderMessage(String thunderMessage) {
        this.thunderMessage = thunderMessage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Double> getTemperature() {
        return temperature;
    }

    public void setTemperature(Map<String, Double> temperature) {
        this.temperature = temperature;
    }

    public String getRainInfo() {
        return rainInfo;
    }

    public void setRainInfo(String rainInfo) {
        this.rainInfo = rainInfo;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getIsThunderstorm() {
        return isThunderstorm;
    }

    public void setIsThunderstorm(String isThunderstorm) {
        this.isThunderstorm = isThunderstorm;
    }

    public String getWindMessage() {
        return windMessage;
    }

    public void setWindMessage(String windMessage) {
        this.windMessage = windMessage;
    }
}
