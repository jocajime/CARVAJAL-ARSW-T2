package weather.services.impl;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weather.cache.IWeatherCache;
import weather.model.Weathercity;
import weather.services.IExternalAPI;
import weather.services.IWeatherServices;

import java.io.IOException;

@Service
public class WeatherServices implements IWeatherServices {
    @Autowired
    IExternalAPI externalAPI;
    @Autowired
    IWeatherCache weatherCache;

    public WeatherServices() {}

    @Override
    public Weathercity getWeatherByCityName(String cityName) throws UnirestException {
        if(weatherCache.CityInCache(cityName)){
           return null;
        }else {
            JSONObject weahtercity = externalAPI.getWeatherByCityName(cityName);
            return null;
        }

    }


}
