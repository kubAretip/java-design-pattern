package pl.pitera.singleton.example;


import java.io.Serializable;

class GameEngine implements Serializable {

    public static final long serialVersionUID = -2838136334310328108L;

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance;

    private GameEngine() {

    }


    public void run() {
        while (true) {
            //czekamy na imput gracza
            // ...
            // ...
        }
    }

    //Problemy z Singleton

    //1
    /*
     zapobieganie prblemów z wielowątkowością (np dwa wątki w tym samym czasie będą chciały stworzyć dwie instancje)
       1. metoda synchronized
       2. blok synchroniczny
       3. tworzenie obiektu od razu (przy polu klasy)
    */
    public static GameEngine getInstance() {
        if (instance == null) {
            synchronized (GameEngine.class) {
                if (instance == null) {
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }

    //2. Obiekt jest tylko unikalny w obrębie jednego classloadera (stosować jakąś synchronizację danych)


    //3. Problemy z serializacją
    /*
     * ktoś może podczas działania programu zaserializować a potem odserializować dowolną ilość kopii
     * aby temu zapobiec trzeba zaimplementować metodę protected Object readResolve() która zwraca instancję
     * ta metoda wykonuje się po każdej deserializacji
     * */

    protected Object readResolve(){
        return getInstance();
    }

    //4. Reflekcja
    /*
    * nie ma ładnego rozwiązania ale singleton można zaimplementować jako enum
    *
    *
    * */

}
