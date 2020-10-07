package pl.pitera.decorator.homework;

class SauceMealDecorator extends MealDecorator {

    Meal meal;

    public SauceMealDecorator(Meal meal) {
        super(meal);
        this.meal = meal;
    }

    @Override
    void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }

    private void addSauce() {
        System.out.println("Danie polewam sosem.");
    }

}
