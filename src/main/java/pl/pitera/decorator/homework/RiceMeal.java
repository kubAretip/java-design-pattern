package pl.pitera.decorator.homework;

class RiceMeal extends Meal {


    @Override
    void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ryżu");
    }
}
