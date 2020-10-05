package pl.pitera.homework.weather;

import pl.pitera.homework.news.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

}
