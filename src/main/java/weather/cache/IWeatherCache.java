package weather.cache;

import org.json.JSONObject;

public interface IWeatherCache {

    boolean CityInCache(String cityName);

    JSONObject getWeatherByCityName(String cityName);

}
