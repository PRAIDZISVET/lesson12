package by.itacademy.lesson12.pizza;

public class Tomato implements Ingredient {

    private static String TOMATO = "tomato";

    @Override
    public String getDescription() {
        return TOMATO;
    }
}
