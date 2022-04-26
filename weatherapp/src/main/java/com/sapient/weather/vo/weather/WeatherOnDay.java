package com.sapient.weather.vo.weather;

import java.util.List;

public class WeatherOnDay {

    private long dt;
    private WeatherMain main;
    private List<WeatherDesc> weather;
    private WeatherCloud clouds;
    private WeatherWind wind;
    private long visibility;
    private long pop;
    private WeatherSys sys;
    private String dt_txt;
    WeatherOnDay(){}

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getVisibility() {
        return visibility;
    }

    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    public WeatherMain getMain() {
        return main;
    }

    public void setMain(WeatherMain main) {
        this.main = main;
    }

    public List<WeatherDesc> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherDesc> weather) {
        this.weather = weather;
    }

    public WeatherCloud getClouds() {
        return clouds;
    }

    public void setClouds(WeatherCloud clouds) {
        this.clouds = clouds;
    }

    public WeatherWind getWind() {
        return wind;
    }

    public void setWind(WeatherWind wind) {
        this.wind = wind;
    }

    public WeatherSys getSys() {
        return sys;
    }

    public void setSys(WeatherSys sys) {
        this.sys = sys;
    }

    @Override
    public String toString() {
        return "WeatherOnDay{" +
                "dt=" + dt +
                ", main=" + main +
                ", weather=" + weather +
                ", clouds=" + clouds +
                ", wind=" + wind +
                ", visibility=" + visibility +
                ", pop=" + pop +
                ", sys=" + sys +
                ", dt_txt='" + dt_txt + '\'' +
                '}';
    }
}
