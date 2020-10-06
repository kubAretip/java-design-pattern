package pl.pitera.factory.homework;

abstract class Car {

    private int engineCapacity;
    private FuelType fuelType;
    private int modelYear;
    private SteeringWheelPosition steeringWheelPosition;


    public Car(int engineCapacity, FuelType fuelType, int modelYear, SteeringWheelPosition steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.modelYear = modelYear;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public void setSteeringWheelPosition(SteeringWheelPosition steeringWheelPosition) {
        this.steeringWheelPosition = steeringWheelPosition;
    }
}
