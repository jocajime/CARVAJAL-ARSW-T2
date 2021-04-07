package weather.services.impl;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weather.cache.IWeatherCache;
import weather.services.IExternalAPI;
import weather.services.IWeatherServices;

@Service
public class WeatherServices implements IWeatherServices {
    @Autowired
    IExternalAPI externalAPI;
    @Autowired
    IWeatherCache weatherCache;

    public WeatherServices() {}

    @Override
    public JSONObject getWeatherByCityName(String cityName) throws UnirestException {
        if(weatherCache.CityInCache(cityName)){
           return null;
        }else {
            JSONObject weatherr = externalAPI.getWeatherByCityName(cityName);
            return weatherr;
        }

    }


}
