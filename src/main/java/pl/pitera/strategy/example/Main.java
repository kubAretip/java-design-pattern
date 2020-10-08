package pl.pitera.strategy.example;

import pl.pitera.strategy.example.chef.Chef;
import pl.pitera.strategy.example.egg_cooker.HardBoiledEggCooker;
import pl.pitera.strategy.example.egg_cooker.SoftBoiledEggCooker;

class Main {

    public static void main(String[] args) {
        //Nowe zamówienie - jajka na twardo!
        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        //Nowe zamówienie - jajka na miękko!
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }


}
