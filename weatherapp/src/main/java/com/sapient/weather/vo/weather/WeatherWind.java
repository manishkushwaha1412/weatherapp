package com.sapient.weather.vo.weather;

public class WeatherWind {

    private double speed;
    private long deg;
    private double gust;

    WeatherWind(){}

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public long getDeg() {
        return deg;
    }

    public void setDeg(long deg) {
        this.deg = deg;
    }

    public double getGust() {
        return gust;
    }

    public void setGust(double gust) {
        this.gust = gust;
    }

    @Override
    public String toString() {
        return "WeatherWind{" +
                "speed=" + speed +
                ", deg=" + deg +
                ", gust=" + gust +
                '}';
    }
}
