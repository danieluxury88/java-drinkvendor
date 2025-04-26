package drinkvendor.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import drinkvendor.model.Drink;
import drinkvendor.model.Recipe;

public class DrinkService {
    private List<Drink> availableDrinks = new ArrayList<>();

    public DrinkService() {
        setupDrinks();
    }

    private void setupDrinks() {
        // Strawberry Drink
        Map<String, Double> strawberryRecipe = new HashMap<>();
        strawberryRecipe.put("Strawberry", 150.0);
        strawberryRecipe.put("Ice", 90.0);
        strawberryRecipe.put("Condensed Milk", 60.0);
        strawberryRecipe.put("Sugar", 24.0);

        // Banana Drink
        Map<String, Double> bananaRecipe = new HashMap<>();
        bananaRecipe.put("Banana", 180.0);
        bananaRecipe.put("Ice", 90.0);
        bananaRecipe.put("Condensed Milk", 60.0);
        bananaRecipe.put("Sugar", 24.0);

        // Mango Drink
        Map<String, Double> mangoRecipe = new HashMap<>();
        mangoRecipe.put("Mango", 210.0);
        mangoRecipe.put("Ice", 90.0);
        mangoRecipe.put("Condensed Milk", 60.0);
        mangoRecipe.put("Sugar", 24.0);

        availableDrinks.add(new Drink("Strawberry", new Recipe(strawberryRecipe)));
        availableDrinks.add(new Drink("Banana", new Recipe(bananaRecipe)));
        availableDrinks.add(new Drink("Mango", new Recipe(mangoRecipe)));
    }

    public List<Drink> getAvailableDrinks() {
        return availableDrinks;
    }

    public Drink getDrinkByName(String name) {
        for (Drink drink : availableDrinks) {
            if (drink.getName().equalsIgnoreCase(name)) {
                return drink;
            }
        }
        return null;
    }

    public void listAvailableDrinks() {
        System.out.println("=== Available Drinks ===");
        for (Drink drink : availableDrinks) {
            System.out.println("- " + drink.getName());
        }
        System.out.println();
    }
}
