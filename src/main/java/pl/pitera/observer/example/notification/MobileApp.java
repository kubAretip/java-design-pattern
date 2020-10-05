package pl.pitera.observer.example.notification;

import pl.pitera.observer.example.order.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Aplikacja mobilna - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }

}
