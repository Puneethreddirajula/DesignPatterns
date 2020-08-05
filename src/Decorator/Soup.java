package Decorator;

public class Soup extends MealPlan {
    private MealPlan mealPlan;

    public Soup(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }

    @Override
    public double cost() {
        if(mealPlan!= null) {
            return mealPlan.cost() + 0.75;
        }
        return 0.75;
    }
}
