package com.sapient.weather.converter;

import com.sapient.weather.service.AbstractService;
import com.sapient.weather.vo.model.WeatherDetails;
import com.sapient.weather.vo.model.WeatherRequest;
import com.sapient.weather.vo.model.WeatherResponse;
import com.sapient.weather.vo.weather.WeatherDesc;
import com.sapient.weather.vo.weather.WeatherResponseInfo;
import com.sapient.weather.vo.weather.WeatherOnDay;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class WeatherConverter extends AbstractService {

    @Value("${weather-base.url}")
    private String weatherBaseUrl;

    public String constructWeatherURL(WeatherRequest weatherRequest) {
        String url = weatherBaseUrl + "q=" + weatherRequest.getCountry() + "&appid=" + weatherRequest.getAuth() + "&cnt=" + weatherRequest.getDays();
        logger.info("URL Constructed: {} ==> ", url);
        return url;
    }

    public WeatherResponse processWeatherResponse(WeatherDetails weatherDetails){
        WeatherResponse weatherResponse = new WeatherResponse();
        if(weatherDetails != null){
            List<WeatherResponseInfo> weatherResponseInfos = weatherDetails.getList().stream().map(this::mapWeatherData).collect(Collectors.toList());
            weatherResponse.setWeathers(weatherResponseInfos);
            weatherResponse.setCity(weatherDetails.getCity().getName());
            weatherResponse.setCountry(weatherDetails.getCity().getCountry());
        }
        return weatherResponse;
    }
    private WeatherResponseInfo mapWeatherData(WeatherOnDay weatherOnDay){
        WeatherResponseInfo weatherResponseInfo = new WeatherResponseInfo();
        weatherResponseInfo.setDate(weatherOnDay.getDt_txt());
        weatherResponseInfo.setIsThunderstorm("NA");// don't get response from API so setting NA
        Map<String, Double> temperature = new HashMap<>();
        temperature.put("minimumTemperature", weatherOnDay.getMain().getTemp_min());
        temperature.put("maximumTemperature", weatherOnDay.getMain().getTemp_max());
        weatherResponseInfo.setTemperature(temperature);
        WeatherDesc weatherDesc = weatherOnDay.getWeather().stream().filter(main->main.getMain().equalsIgnoreCase("Rain")).findFirst().orElse(null);
        if(weatherDesc != null) {
            weatherResponseInfo.setRainInfo(weatherDesc.getMain());
        }
        weatherResponseInfo.setWindSpeed(weatherOnDay.getWind().getSpeed());

        // I am assuming that temperature is in kelvin, I need to convert the same in celsius
        double tempCelsius = weatherOnDay.getMain().getTemp() - 273.15;
        int tempVal = Double.compare(tempCelsius, 40.0);

        if(tempVal >= 0 ){
            weatherResponseInfo.setTemMessage("Use Sunscreen Lotion");
        }else if(weatherDesc != null ){
            weatherResponseInfo.setTemMessage("Carry Umbrella");
        }

        // check Wind message
        int windVal = Double.compare(weatherOnDay.getWind().getSpeed(), 10);
        if(windVal > 0){
            weatherResponseInfo.setWindMessage("It's too Windy, watch out!");
        }
        return weatherResponseInfo;

    }
}
