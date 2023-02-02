package chippy.food;

import java.util.ArrayList;

public abstract class Food {
    String name;
    boolean requiresBatter;
    ArrayList<String> condiments = new ArrayList<String>();

    public void cook() {
        if (this.requiresBatter) {
            System.out.println("Battering " + this.name);
        } else {
            return;
        }
        System.out.println("Frying " + this.name);
        for (String condiment : this.condiments) {
            System.out.println("Adding " + condiment);
        }
        System.out.println("Serving " + this.name);
    };

    public String getName() {
        return name;
    }
}