package main.java.com.drinkvendor.model;

public class Fruit extends Ingredient {
    private double gramsPer100mlBlended;

    public Fruit(String name, double gramsPer100mlBlended, double quantityAvailable) {
        super(name, "g", quantityAvailable);
        this.gramsPer100mlBlended = gramsPer100mlBlended;
    }

    public double getGramsPer100mlBlended() {
        return gramsPer100mlBlended;
    }
}
