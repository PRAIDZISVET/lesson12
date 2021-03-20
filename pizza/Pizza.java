package by.itacademy.lesson12.pizza;

public class Pizza implements PizzaIngredient {

    private Ingredient ingredient;

    public Pizza(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String getDescription() {
        return ingredient.getDescription();
    }
}
