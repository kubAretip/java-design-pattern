package pl.pitera.factory.homework;

class ContinentalFactory implements Factory {

    @Override
    public BMW buildBMW(BmwModel model) {

        switch (model) {
            case E36:
                return new BMW(2499, FuelType.PETROL, 2000, SteeringWheelPosition.RIGHT);
            case E46:
                return new BMW(2000, FuelType.PETROL, 2004, SteeringWheelPosition.RIGHT);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }

    }

    @Override
    public Ford buildFord(FordModel model) {
        switch (model) {
            case CMAX:
                return new Ford(2000, FuelType.DIESEL, 2009, SteeringWheelPosition.RIGHT);
            case MUSTANG:
                return new Ford(5000, FuelType.PETROL, 2018, SteeringWheelPosition.RIGHT);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }
}
