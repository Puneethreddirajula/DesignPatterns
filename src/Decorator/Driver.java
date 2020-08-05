package Decorator;

public class Driver {
    public static void main(String[] args){
        MealPlan fruit = new Fruit(null);
        MealPlan salad = new Salad(fruit);

        MealPlan soup = new Soup(salad);

        System.out.println(soup.cost());
    }
}
