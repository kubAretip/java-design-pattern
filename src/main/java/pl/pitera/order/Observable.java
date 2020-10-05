package pl.pitera.order;

import pl.pitera.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

}
