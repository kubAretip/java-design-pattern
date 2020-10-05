package pl.pitera.factory.example.abstractFabric.units;

import pl.pitera.factory.example.fabricMethod.units.UnitType;

public class RedFactory extends Factory {
    @Override
    public InfantryUnit creteInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(20, 0, 6);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public MechanizedUnit creteMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(70, 0, 35);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit creteAirUnit(UnitType unitType) {
        switch (unitType) {
            case HELI:
                return new Helicopter(5, 0, 40);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
