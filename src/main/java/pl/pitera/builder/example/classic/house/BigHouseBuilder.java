package pl.pitera.builder.example.classic.house;

public class BigHouseBuilder implements HouseBuilder {

    private House house;

    public BigHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Big walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("Big floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("Big rooms");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Big roofs");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("Big windows");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("Big doors");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("Big garage");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
