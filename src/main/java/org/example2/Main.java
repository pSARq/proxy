package org.example2;

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherServiceProxy();

        // Primera llamada, se obtiene desde el servicio remoto
        System.out.println(weatherService.getWeather("Bogotá"));
        System.out.println();

        // Segunda llamada, se obtiene desde el caché
        System.out.println(weatherService.getWeather("Bogotá"));
        System.out.println();

        // Llamada a un nuevo lugar, se obtiene desde el servicio remoto
        System.out.println(weatherService.getWeather("Cali"));
        System.out.println();

        // Otra llamada al segundo lugar, se obtiene desde el caché
        System.out.println(weatherService.getWeather("Cali"));
    }
}
