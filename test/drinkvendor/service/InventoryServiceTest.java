package test.drinkvendor.service;

import drinkvendor.model.Fruit;
import drinkvendor.model.Ingredient;
import drinkvendor.model.Drink;
import drinkvendor.service.DrinkService;
import drinkvendor.service.InventoryService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryServiceTest {

    private InventoryService inventoryService;
    private DrinkService drinkService;

    @BeforeEach
    public void setUp() {
        inventoryService = new InventoryService();
        drinkService = new DrinkService();
    }

    @Test
    public void testInventoryReductionAfterSale() {
        double initialIce = inventoryService.getIngredient("Ice").getQuantityAvailable();

        Drink drink = drinkService.getDrinkByName("Strawberry");
        boolean saleResult = inventoryService.makeDrink(drink);

        assertTrue(saleResult, "Sale should succeed");
        double afterIce = inventoryService.getIngredient("Ice").getQuantityAvailable();
        assertTrue(afterIce < initialIce, "Ice quantity should decrease after sale");
    }

    @Test
    public void testSaleFailsWhenInventoryLow() {
        Ingredient ice = inventoryService.getIngredient("Ice");
        ice.reduceQuantity(ice.getQuantityAvailable());

        Drink drink = drinkService.getDrinkByName("Strawberry");
        boolean saleResult = inventoryService.makeDrink(drink);

        assertFalse(saleResult, "Sale should fail when ingredients are insufficient");
    }
}
