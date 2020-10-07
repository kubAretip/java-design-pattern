package pl.pitera.decorator.homework;

class ShrimpMealDecorator extends MealDecorator {

    Meal meal;

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
        this.meal = meal;
    }

    @Override
    void prepareMeal() {
        super.prepareMeal();
        addShrimp();
    }

    private void addShrimp() {
        System.out.println("Do dania dodaję krewetki.");
    }
}
