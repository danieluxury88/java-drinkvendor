package drinkvendor;

import java.util.Scanner;

import drinkvendor.model.Drink;
import drinkvendor.service.DrinkService;
import drinkvendor.service.InventoryService;

public class Main {
    private static InventoryService inventoryService = new InventoryService();
    private static DrinkService drinkService = new DrinkService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("=== Welcome to the Fruit Drink Vendor App ===\n");

        while (running) {
            System.out.println("Please select an option:");
            System.out.println("1. List Inventory");
            System.out.println("2. List Available Drinks");
            System.out.println("3. Sell a Drink");
            System.out.println("4. Exit");
            System.out.print("> ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    inventoryService.listInventory();
                    break;
                case "2":
                    drinkService.listAvailableDrinks();
                    break;
                case "3":
                    sellDrinkFlow();
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }

    private static void sellDrinkFlow() {
        drinkService.listAvailableDrinks();
        System.out.print("Enter the name of the drink you want to sell: ");
        String drinkName = scanner.nextLine();

        Drink selectedDrink = drinkService.getDrinkByName(drinkName);

        if (selectedDrink == null) {
            System.out.println("❌ Drink not found.\n");
            return;
        }

        if (inventoryService.makeDrink(selectedDrink)) {
            System.out.println("Enjoy your " + selectedDrink.getName() + " drink!\n");
        } else {
            System.out.println("Sorry, not enough ingredients to make the drink.\n");
        }
        // Check if any ingredient is low in inventory
        inventoryService.checkLowInventory(selectedDrink);

    }
}
