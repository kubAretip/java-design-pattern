package pl.pitera.observer.homework.weather;

import pl.pitera.observer.homework.news.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

}
