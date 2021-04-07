package weather.cache.impl;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import weather.cache.IWeatherCache;

import java.util.ArrayList;
@Service
public class WeatherCache implements IWeatherCache {

    private ArrayList<String> citys;
    private ArrayList<JSONObject> citysJSON;

    /**
     * @param cityName
     * @return
     */
    @Override
    public boolean CityInCache(String cityName) {
        return false;
    }

    /**
     * @param cityName
     * @return
     */
    @Override
    public JSONObject getWeatherByCityName(String cityName) {
        return null;
    }
}
