package drinkvendor.model;

public class Ingredient {
    protected String name;
    protected String unit;
    protected double quantityAvailable;

    public Ingredient(String name, String unit, double quantityAvailable) {
        this.name = name;
        this.unit = unit;
        this.quantityAvailable = quantityAvailable;
    }

    public String getName() {
        return name;
    }

    public double getQuantityAvailable() {
        return quantityAvailable;
    }

    public void reduceQuantity(double amount) {
        this.quantityAvailable -= amount;
    }

    public String toString() {
        return name + ": " + quantityAvailable + " " + unit;
    }
}
