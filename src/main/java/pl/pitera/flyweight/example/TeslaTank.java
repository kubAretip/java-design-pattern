package pl.pitera.flyweight.example;


import pl.pitera.flyweight.example.unitStats.UnitStats;

public class TeslaTank {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public TeslaTank(int x, int y) {
        stats = UnitStatsRepository.getTeslaTankStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();

    }
}
