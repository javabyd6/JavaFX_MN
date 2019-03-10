package Pogoda;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

/**
 * @author nieckarz
 */
public class SerwisPogody {
    final String finalUrl= "http://api.apixu.com/v1/current.json?key=9889be10aad4447183a115547191003&q=";


    public SerwisPogody() {


    }

    public Pogoda getCityPogoda(String CityName) {
        Pogoda pogoda = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            URL url = new URL(finalUrl + CityName);
            pogoda = mapper.readValue(url, Pogoda.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return pogoda;
    }
}