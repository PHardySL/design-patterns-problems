package chippy.shop;

import chippy.food.EdiChips;
import chippy.food.EdiFish;
import chippy.food.EdiJumboSausage;
import chippy.food.EdiMarsBar;
import chippy.food.EngChips;
import chippy.food.EngFish;
import chippy.food.EngJumboSausage;
import chippy.food.Food;

public class Chippy {

    public Food orderFood(String location, String foodType) {
        Food food;
        System.out.println("##########");
        System.out.println("Beginning new order");

        if (location.equals("edinburgh")) {
            if (foodType.equals("fish")) {
                food = new EdiFish();
            } else if (foodType.equals("jumbo sausage")) {
                food = new EdiJumboSausage();
            } else if (foodType.equals("chips")) {
                food = new EdiChips();
            } else if (foodType.equals("mars bar")) {
                food = new EdiMarsBar();
            } else {
                System.out.println("item not on the menu");
                return null;
            }
        } else if (location.equals("england")) {
            if (foodType.equals("fish")) {
                food = new EngFish();
            } else if (foodType.equals("jumbo sausage")) {
                food = new EngJumboSausage();
            } else if (foodType.equals("chips")) {
                food = new EngChips();
            } else {
                System.out.println("item not on the menu");
                return null;
            }
        } else {
            return null;
        }

        food.cook();
        return food;
    }
}
