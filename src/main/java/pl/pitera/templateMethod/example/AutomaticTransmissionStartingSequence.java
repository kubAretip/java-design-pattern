package pl.pitera.templateMethod.example;

public class AutomaticTransmissionStartingSequence extends ClassicCarStartingSequence {

    @Override
    public void setTheGear() {
        System.out.println("Automat");
    }

}
