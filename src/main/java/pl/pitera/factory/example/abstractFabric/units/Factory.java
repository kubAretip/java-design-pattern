package pl.pitera.factory.example.abstractFabric.units;

import pl.pitera.factory.example.fabricMethod.units.UnitType;

public abstract class Factory {

    abstract public InfantryUnit creteInfantryUnit(UnitType unitType);

    abstract public MechanizedUnit creteMechanizedUnit(UnitType unitType);

    abstract public AirUnit creteAirUnit(UnitType unitType);

}
