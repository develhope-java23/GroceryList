public class GroceryListItem {

    private String brand;

    private int quantity;

    public GroceryListItem(String brand, int quantity) {
        this.brand = brand;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
