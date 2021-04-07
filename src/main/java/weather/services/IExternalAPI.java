package weather.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

public interface IExternalAPI {

    JSONObject getWeatherByCityName(String cityName) throws UnirestException;

}
