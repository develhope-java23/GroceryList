import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroceryListTest {
    @Test
    public void testCountByString() {
        GroceryList groceryList = new GroceryList();
        groceryList.addItem("Pere", "Il contadino di una volta", 12);
        groceryList.addItem("Succo di Pere", "Santal", 3);
        groceryList.addItem("Torta di Pere", "La panetteria a caso", 5);
        groceryList.addItem("Torta di mele", "La panetteria a caso", 4);
        int result = groceryList.countByString("Pere");
        assertEquals(20,result);
    }
    @Test
    public void testTotalQuantityOfSpecificBrand() {
        GroceryList groceryList = new GroceryList();
        groceryList.addItem("Pere", "Il contadino di una volta", 12);
        groceryList.addItem("Succo di Pere", "Santal", 3);
        groceryList.addItem("Torta di Pere", "La panetteria a caso", 5);
        groceryList.addItem("Torta di mele", "La panetteria a caso", 4);
        int result = groceryList.totalQuantityOfSpecificBrand("La panetteria a caso");
        assertEquals(9,result);
    }
    @Test
    public void testCountByStringEmpty() {
        GroceryList groceryList = new GroceryList();
        int result = groceryList.countByString("Pere");
        assertEquals(0,result);
    }
}