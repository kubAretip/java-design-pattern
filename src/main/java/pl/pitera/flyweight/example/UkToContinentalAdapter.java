package pl.pitera.flyweight.example;

class UkToContinentalAdapter implements ContinentalDevice {

    UKDevice device;

    public UkToContinentalAdapter(UKDevice device) {
        this.device = device;
    }

    @Override
    public void on() {
        device.powerOn();
    }
}
