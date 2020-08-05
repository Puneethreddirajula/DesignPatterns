package Decorator;

public class Fruit extends MealPlan {

    private MealPlan mealPlan;

    Fruit(MealPlan mealPlan){
        this.mealPlan = mealPlan;
    }

    @Override
    public double cost() {
        if(mealPlan!= null) {
            return mealPlan.cost() + 0.25;
        }
        return 0.25;
    }
}
