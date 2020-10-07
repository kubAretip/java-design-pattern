package pl.pitera.templateMethod.example;

abstract class CarStartingSequence {

    public final void startTheCar() {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Wciskamy pedal gazu");
    }

    public abstract void setTheGear();

    public abstract void startTheIgnition();

    private void fastenSeatbelts() {
        System.out.println("Zapinamy pasy");
    }


}
