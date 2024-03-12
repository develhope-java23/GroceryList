import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroceryList {

    private HashMap<String, GroceryListItem> items;

    public GroceryList() {
        this.items = new HashMap<>();
    }

    public HashMap<String, GroceryListItem> getItems() {
        return items;
    }

    public void addItem(String name, String brand, int quantity) {

        GroceryListItem item = items.get(name);

        if (item == null) {
            items.put(name, new GroceryListItem(brand, quantity));
        } else {
            item.setQuantity(item.getQuantity() + quantity);
        }
    }

    public int totalQuantityOfSpecificBrand(String brand) {
        int result = 0;
        for (GroceryListItem item : items.values()) {
            if (brand.equals(item.getBrand())) {
                result += item.getQuantity();
            }
        }
        return result;
    }

    public int countByString(String element) {
        int counter = 0;
        for (String item : items.keySet()) {
            if (item.contains(element)) {
                counter += items.get(item).getQuantity();
            }
        }
        return counter;
    }

}
