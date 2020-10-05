package pl.pitera.homework.news;

import pl.pitera.homework.weather.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TV news - nowa pogoda: temperatura = " + weatherForecast.getTemperature() + " ciśnienie = " + weatherForecast.getPressure());
    }
}
