package pl.pitera.observer.notification;

import pl.pitera.observer.order.Order;

public interface Observer {

    void update(Order order);

}
