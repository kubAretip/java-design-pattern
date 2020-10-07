package pl.pitera.decorator.homework;

class PotatoMeal extends Meal {

    @Override
    void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ziemniaków.");
    }
}
