package pl.pitera.builder.example.classic.house;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildFloors();
        houseBuilder.buildRooms();
        houseBuilder.buildDoors();
        houseBuilder.buildGarage();
        houseBuilder.buildRoof();
        houseBuilder.buildWindows();
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }


}
