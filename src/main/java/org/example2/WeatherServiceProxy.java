package org.example2;

import java.util.HashMap;
import java.util.Map;

public class WeatherServiceProxy implements WeatherService {
    private RealWeatherService realWeatherService;
    private final Map<String, String> cache;

    public WeatherServiceProxy() {
        this.realWeatherService = new RealWeatherService();
        this.cache = new HashMap<>();
    }

    /*En este otro ejemplo se usa un proxy para simular el llamado de un servicio remoto y también el almacenamiento
    * en cache para evitar tener que consumir el llamado remoto cada vez que realizan una petición similar*/
    @Override
    public String getWeather(String location) {
        if (cache.containsKey(location)) {
            System.out.println("Devolviendo datos meteorológicos almacenados en caché para la ubicación: " + location);
            return cache.get(location);
        }

        String weatherData = realWeatherService.getWeather(location);
        cache.put(location, weatherData);
        return weatherData;
    }
}
