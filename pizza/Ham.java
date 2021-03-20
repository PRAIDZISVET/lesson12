package by.itacademy.lesson12.pizza;

public class Ham implements Ingredient {

    private Ingredient ingredient;

    public Ham(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String getDescription() {
        return "ham, " + ingredient.getDescription();
    }
}
