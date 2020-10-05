package pl.pitera.builder.example.innerClass;

import pl.pitera.builder.example.innerClass.house.House;

class Main {

    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .buildDoors("doors")
                .buildRoof("roof")
                .buildFloors("floors")
                .build();
    }
}
