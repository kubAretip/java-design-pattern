package pl.pitera.builder.example.classic;

import pl.pitera.builder.example.classic.house.BigHouseBuilder;
import pl.pitera.builder.example.classic.house.House;
import pl.pitera.builder.example.classic.house.HouseDirector;
import pl.pitera.builder.example.classic.house.SmallHouseBuilder;

class Main {

    public static void main(String[] args) {

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);



    }
}
