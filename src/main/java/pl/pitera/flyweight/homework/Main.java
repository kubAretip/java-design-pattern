package pl.pitera.flyweight.homework;


import pl.pitera.flyweight.homework.api.LibraryAPI;
import pl.pitera.flyweight.homework.api.LibraryAPIImpl;

public class Main {

    public static void main(String[] args) {


        LibraryAPI api = new LibraryAPIImpl();

        User user = new User("Paweł", "Cwik", "32131212");

        BookConnector connector = new BookConnector(user, api);

        connector.checkAvailability("Harry Potter i Zakon Feniksa");

    }

}
