package weather.services.impl;

import com.google.gson.JsonObject;
import weather.services.IExternalAPI;

import java.net.http.HttpResponse;

public class ExternalAPI implements IExternalAPI {

    public ExternalAPI(){}

    @Override
    public JsonObject getWeatherByCityName(String cityName) {
        HttpResponse<String> response = Unirest.get("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=ea9c5a7d873963c1abb9207fc904db83")
                .asString();
        return new JSONObject(response.getBody());
    }
}
