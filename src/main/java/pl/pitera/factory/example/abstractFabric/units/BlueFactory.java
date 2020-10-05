package pl.pitera.factory.example.abstractFabric.units;


import pl.pitera.factory.example.fabricMethod.units.UnitType;

public class BlueFactory extends Factory {

    @Override
    public InfantryUnit creteInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(25, 0, 5);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public MechanizedUnit creteMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(100, 0, 25);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit creteAirUnit(UnitType unitType) {
        switch (unitType) {
            case HELI:
                return new Helicopter(50, 0, 30);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
