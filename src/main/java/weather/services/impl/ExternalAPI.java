package weather.services.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import weather.services.IExternalAPI;

import java.io.IOException;


@Service
public class ExternalAPI implements IExternalAPI {

    public ExternalAPI(){}

    @Override
    public JSONObject getWeatherByCityName(String cityName) throws UnirestException {
        String url = String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&appid=79a888aec0f5cf1eddaf9b5e0b2063af", cityName);
        HttpResponse<JsonNode> response = Unirest.get(url).asJson();
        return new JSONObject(response.getBody());
    }


}