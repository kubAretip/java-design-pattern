package pl.pitera.factory.example.abstractFabric.units;

public abstract class InfantryUnit extends Unit {

    protected InfantryUnit(int hp, int exp, int dmgDone) {
        super(hp, exp, dmgDone);
    }
}
