package pl.pitera.homework.news;

import pl.pitera.homework.weather.WeatherForecast;

public class RadioNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio news - nowa pogoda: temperatura = " + weatherForecast.getTemperature() + " ciśnienie = " + weatherForecast.getPressure());

    }
}
