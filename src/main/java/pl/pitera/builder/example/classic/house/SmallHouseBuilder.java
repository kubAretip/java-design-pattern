package pl.pitera.builder.example.classic.house;

public class SmallHouseBuilder implements HouseBuilder {

    private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Small walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("Small floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("Small rooms");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Small roofs");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("Small windows");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("Small doors");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("Small garage");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
