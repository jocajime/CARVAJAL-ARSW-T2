package weather.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.io.IOException;

public interface IWeatherServices {

    JSONObject getWeatherByCityName(String city) throws UnirestException, IOException;

}
