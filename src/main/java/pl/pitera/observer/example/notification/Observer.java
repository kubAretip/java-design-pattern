package pl.pitera.observer.example.notification;

import pl.pitera.observer.example.order.Order;

public interface Observer {

    void update(Order order);

}
