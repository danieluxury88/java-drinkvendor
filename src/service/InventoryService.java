package service;

import model.Drink;
import model.Ingredient;
import model.Fruit;
import model.Recipe;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    private Map<String, Ingredient> ingredients = new HashMap<>();

    public InventoryService() {
        // Hardcoded starting inventory
        ingredients.put("Strawberry", new Fruit("Strawberry", 100, 1000)); // 1000g strawberries
        ingredients.put("Banana", new Fruit("Banana", 120, 1000)); // 1000g bananas
        ingredients.put("Mango", new Fruit("Mango", 140, 1000)); // 1000g mangos
        ingredients.put("Ice", new Ingredient("Ice", "ml", 3000)); // 3000ml ice
        ingredients.put("Condensed Milk", new Ingredient("Condensed Milk", "ml", 2000)); // 2000ml condensed milk
        ingredients.put("Sugar", new Ingredient("Sugar", "g", 1000)); // 1000g sugar
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
        // Deduct ingredients
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
}
