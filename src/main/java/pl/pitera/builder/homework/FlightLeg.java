package pl.pitera.builder.homework;

class FlightLeg {

    private String from;
    private String to;
    private boolean delayed;
    private Double price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public Double getPrice() {
        return price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {

        private String from;
        private String to;
        private boolean delayed;
        private Double price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }


        public FlightLegBuilder price(double price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {

            if (price == null)
                throw new IllegalStateException("Brak wymaganego pola - cena");


            return new FlightLeg(this);
        }

    }

}
