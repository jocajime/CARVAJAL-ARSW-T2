package weather.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import weather.model.Weathercity;

import java.io.IOException;

public interface IWeatherServices {

    Weathercity getWeatherByCityName(String city) throws UnirestException, IOException;

}
