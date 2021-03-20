package by.itacademy.lesson12.pizza;

public class Cheese implements PizzaIngredient {

    private Ingredient ingredient;

    public Cheese(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String getDescription() {
        return "cheese, " + ingredient.getDescription();
    }
}
