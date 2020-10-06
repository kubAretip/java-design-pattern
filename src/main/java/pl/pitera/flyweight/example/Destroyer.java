package pl.pitera.flyweight.example;

import pl.pitera.flyweight.example.unitStats.UnitStats;

public class Destroyer {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public Destroyer(int x, int y) {
        stats = UnitStatsRepository.getDestroyerStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
