package weather.cache;

import org.json.JSONObject;

public interface IWeatherCache {

    /**
     * @param cityName
     * @return
     */
    boolean CityInCache(String cityName);

    /**
     * @param cityName
     * @return
     */
    JSONObject getWeatherByCityName(String cityName);

}
