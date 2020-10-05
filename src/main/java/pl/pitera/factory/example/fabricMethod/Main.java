package pl.pitera.factory.example.fabricMethod;

import pl.pitera.factory.example.fabricMethod.units.Factory;
import pl.pitera.factory.example.fabricMethod.units.Unit;
import pl.pitera.factory.example.fabricMethod.units.UnitFactory;
import pl.pitera.factory.example.fabricMethod.units.UnitType;

class Main {

    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.creteUnit(UnitType.TANK);
        Unit rifleman = factory.creteUnit(UnitType.RIFLEMAN);


    }

}
