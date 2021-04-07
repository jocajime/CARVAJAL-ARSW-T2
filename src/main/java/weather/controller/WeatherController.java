package weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import weather.services.IWeatherServices;

@RestController
public class WeatherController {

    @Autowired
    IWeatherServices weatherServices;

    /**
     * @param cityName
     * @return
     */
    @RequestMapping(value="/weather/{city}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeatherByCity(@PathVariable(name="city") String cityName) {
        try {
            return new ResponseEntity<>(weatherServices.getWeatherByCityName(cityName), HttpStatus.ACCEPTED);
        }catch(Exception e){
            return new ResponseEntity<>("Ha ocurrido un error", HttpStatus.BAD_REQUEST);
        }
    }

}
