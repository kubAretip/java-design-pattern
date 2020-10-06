package pl.pitera.flyweight.example;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Object> activeUnit = new ArrayList<>();


        for (int i = 0; i < 1000000; i++) {
            activeUnit.add(new Rifleman(0, 0));
            activeUnit.add(new Destroyer(0, 0));
            activeUnit.add(new TeslaTank(0, 0));

        }

    }

}
