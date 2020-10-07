package pl.pitera.memento.example;

import pl.pitera.memento.example.smart_app.SmartApp;
import pl.pitera.memento.example.smart_app.SmartAppCaretaker;

public class Main {

    public static void main(String[] args) {

        SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();
        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);

        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.changeVersion(1.7);
        smartApp.changeVersion(1.8);
        smartApp.changeVersion(2.2);

        smartApp.load(smartAppCaretaker.getMemento(0));


    }

}
