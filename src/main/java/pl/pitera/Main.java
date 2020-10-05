package pl.pitera;

import pl.pitera.notification.Email;
import pl.pitera.notification.MobileApp;
import pl.pitera.notification.TextMessage;
import pl.pitera.order.Order;
import pl.pitera.order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(email);
        order.registerObserver(mobileApp);

        order.notifyObservers();

        order.changeOrderStatus(OrderStatus.ZAREJESTROWANE);

        System.out.println("---------------------------------");

        order.changeOrderStatus(OrderStatus.WYSLANE);


        System.out.println("---------------------------------");

        order.unregisterObserver(textMessage);
        order.changeOrderStatus(OrderStatus.ODEBRANE);
    }


}
