package org.example2;

public class RealWeatherService implements WeatherService {
    @Override
    public String getWeather(String location) {
        System.out.println("Obteniendo datos meteorológicos del servicio remoto para la ubicación: " + location);
        return "Datos meteorológicos para " + location;
    }
}
