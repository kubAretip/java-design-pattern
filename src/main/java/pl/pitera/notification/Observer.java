package pl.pitera.notification;

import pl.pitera.order.Order;

public interface Observer {

    void update(Order order);

}
