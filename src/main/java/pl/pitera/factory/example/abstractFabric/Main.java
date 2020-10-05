package pl.pitera.factory.example.abstractFabric;

import pl.pitera.factory.example.abstractFabric.units.*;
import pl.pitera.factory.example.fabricMethod.units.UnitType;

class Main {
    public static void main(String[] args) {
        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        InfantryUnit redInfantry = redFactory.creteInfantryUnit(UnitType.RIFLEMAN);
        MechanizedUnit redTank = redFactory.creteMechanizedUnit(UnitType.TANK);

        InfantryUnit blueInfantry = blueFactory.creteInfantryUnit(UnitType.RIFLEMAN);
        MechanizedUnit blueTank = blueFactory.creteMechanizedUnit(UnitType.TANK);


    }

}
