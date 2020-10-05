package pl.pitera.homework.news;

import pl.pitera.homework.weather.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);

}
