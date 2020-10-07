package pl.pitera.decorator.homework;

class ChickenMealDecorator extends MealDecorator {

    Meal meal;

    public ChickenMealDecorator(Meal meal) {
        super(meal);
        this.meal = meal;
    }

    @Override
    void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }

    private void addChicken() {
        System.out.println("Do dania dodaję kurczaka.");
    }
}
