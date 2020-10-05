package pl.pitera.observer.homework.news;

import pl.pitera.observer.homework.weather.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet news - nowa pogoda: temperatura = " + weatherForecast.getTemperature() + " ciśnienie = " + weatherForecast.getPressure());

    }
}
