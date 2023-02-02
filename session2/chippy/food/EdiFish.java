package chippy.food;

public class EdiFish extends Food {

    public EdiFish() {
        name = "fish";
        requiresBatter = true;
        condiments.add("salt");
        condiments.add("sauce");
    }
}
