package pl.pitera.observer.example.order;

import pl.pitera.observer.example.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

}
