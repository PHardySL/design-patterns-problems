package chippy;

import chippy.food.Food;
import chippy.shop.Chippy;

public class RunShop {

    public static void main(String[] args) {

        Chippy chippy = new Chippy();

        Food food;
        food = chippy.orderFood("england", "chips");
        System.out.println("Phil got " + food.getName());

        food = chippy.orderFood("edinburgh", "fish");
        System.out.println("James got a " + food.getName());
        food = chippy.orderFood("edinburgh", "mars bar");
        System.out.println("Gabi got a " + food.getName());

        food = chippy.orderFood("england", "doughnut");
        System.out.println("Phil tried to order a doughnut");

    }

}
