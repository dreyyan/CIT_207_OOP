public class Kiosk {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Getters
    public String getItemName() { return this.itemName; }
    public double getPrice() { return this.price; }
    public int getQuantity() { return this.quantity; }

    // Setters
    public void setItemName() { this.itemName = itemName; }
    public void setPrice() { this.price = price; }
    public void setQuantity() { this.quantity = quantity; }

    // Constructor
    public Kiosk(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Methods
    public static void purchaseItem(int quantity) {
        
    }
}
