package weather.services;

import com.google.gson.JsonObject;

public interface IExternalAPI {

    JsonObject getWeatherByCityName(String cityName);

}
