package main.java.com.drinkvendor.model;

import java.util.Map;

public class Recipe {
    private Map<String, Double> ingredients;

    public Recipe(Map<String, Double> ingredients) {
        this.ingredients = ingredients;
    }

    public Map<String, Double> getIngredients() {
        return ingredients;
    }

    public Double getRequiredAmount(String ingredientName) {
        return ingredients.getOrDefault(ingredientName, 0.0);
    }
}
