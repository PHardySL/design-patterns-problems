package chippy.food;

public class EngChips extends Food {

    public EngChips() {
        name = "chips";
        requiresBatter = false;
        condiments.add("salt");
        condiments.add("vinegar");
    }
}
