package pl.pitera.flyweight.example;

import pl.pitera.flyweight.example.unitStats.UnitStats;

class UnitStatsRepository {

    private static UnitStats destroyerStats = new UnitStats("Destroyer", 500, 250, 70, 10, 800);
    private static UnitStats riflemanStats = new UnitStats("Destroyer", 50, 25, 10, 25, 25);
    private static UnitStats teslaTankStats = new UnitStats("Tesla tank", 250, 100, 10, 37, 450);

    private UnitStatsRepository() {

    }

    public static UnitStats getDestroyerStats() {
        return destroyerStats;
    }

    public static UnitStats getRiflemanStats() {
        return riflemanStats;
    }

    public static UnitStats getTeslaTankStats() {
        return teslaTankStats;
    }
}
