package Decorator;

public class Salad extends MealPlan {

    private MealPlan mealPlan;

    public Salad(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }

    @Override
    public double cost() {
        if(mealPlan!= null) {
            return mealPlan.cost() + 0.50;
        }

        return 0.50;
    }
}
