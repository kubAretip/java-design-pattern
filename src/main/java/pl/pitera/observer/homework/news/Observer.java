package pl.pitera.observer.homework.news;

import pl.pitera.observer.homework.weather.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);

}
