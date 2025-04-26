package drinkvendor.service;

import java.util.HashMap;
import java.util.Map;

import drinkvendor.model.Drink;
import drinkvendor.model.Fruit;
import drinkvendor.model.Ingredient;
import drinkvendor.model.Recipe;

public class InventoryService {
    private Map<String, Ingredient> ingredients = new HashMap<>();

    public InventoryService() {
        ingredients.put("Strawberry", new Fruit("Strawberry", 100, 1000));
        ingredients.put("Banana", new Fruit("Banana", 120, 1000));
        ingredients.put("Mango", new Fruit("Mango", 140, 1000));
        ingredients.put("Ice", new Ingredient("Ice", "ml", 3000));
        ingredients.put("Condensed Milk", new Ingredient("Condensed Milk", "ml", 2000));
        ingredients.put("Sugar", new Ingredient("Sugar", "g", 1000));
    }

    public void listInventory() {
        System.out.println("=== Current Inventory ===");
        for (Ingredient ingredient : ingredients.values()) {
            System.out.println(ingredient);
        }
        System.out.println();
    }

    public boolean canMakeDrink(Drink drink) {
        for (Map.Entry<String, Double> entry : drink.getRecipe().getIngredients().entrySet()) {
            String ingredientName = entry.getKey();
            double requiredAmount = entry.getValue();
            Ingredient ingredient = ingredients.get(ingredientName);
            if (ingredient == null || ingredient.getQuantityAvailable() < requiredAmount) {
                return false;
            }
        }
        return true;
    }

    public boolean makeDrink(Drink drink) {
        if (!canMakeDrink(drink)) {
            System.out.println("❌ Not enough ingredients to make " + drink.getName());
            return false;
        }

        for (Map.Entry<String, Double> entry : drink.getRecipe().getIngredients().entrySet()) {
            String ingredientName = entry.getKey();
            double requiredAmount = entry.getValue();
            ingredients.get(ingredientName).reduceQuantity(requiredAmount);
        }
        System.out.println("✅ Successfully made: " + drink.getName());
        return true;
    }

    public Ingredient getIngredient(String name) {
        return ingredients.get(name);
    }

    public void checkLowInventory(Drink drink) {
        System.out.println("=== Ingredient Stock Check ===");
        boolean warning = false;

        for (Map.Entry<String, Double> entry : drink.getRecipe().getIngredients().entrySet()) {
            String ingredientName = entry.getKey();
            double amountForOneDrink = entry.getValue();
            double requiredForFourDrinks = amountForOneDrink * 4;

            Ingredient ingredient = ingredients.get(ingredientName);
            if (ingredient != null && ingredient.getQuantityAvailable() < requiredForFourDrinks) {
                System.out.println("⚠️ Warning: Low stock for " + ingredientName + ". Available: " + ingredient.getQuantityAvailable());
                warning = true;
            }
        }

        if (!warning) {
            System.out.println("✅ All ingredients sufficient for at least 4 more drinks.\n");
        } else {
            System.out.println();
        }
    }
}
