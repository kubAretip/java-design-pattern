package pl.pitera.templateMethod.example;

public class ButtonCarStartingSequence extends CarStartingSequence {

    @Override
    public void setTheGear() {
        System.out.println("Ustawiamy bieg");
    }

    @Override
    public void startTheIgnition() {
        System.out.println("Wcisnij guzik");
    }

}
