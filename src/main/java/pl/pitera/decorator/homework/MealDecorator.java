package pl.pitera.decorator.homework;

class MealDecorator extends Meal {

    private Meal meal;

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    void prepareMeal() {
        this.meal.prepareMeal();
    }
}
