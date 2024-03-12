import java.util.ArrayList;
import java.util.List;

public class GroceryList {

    private List<GroceryListItem> items;

    public GroceryList () {
        this.items = new ArrayList<>();
    }

    public List<GroceryListItem> getItems() {
        return items;
    }

    public void addItem (String name, int quantity) {
        for (GroceryListItem item : items) {
            if (name.equals(item.getName())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new GroceryListItem(name, quantity));
    }
}
