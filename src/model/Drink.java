package model;

public class Drink {
    private String name;
    private Recipe recipe;

    public Drink(String name, Recipe recipe) {
        this.name = name;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public Recipe getRecipe() {
        return recipe;
    }
}
