package Lab.Assignment_5_1_Kiosk;
public class Kiosk {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;
    
    // Getters & Setters
    public String getItemName() { return this.itemName; }
    public double getPrice() { return this.price; }
    public int getQuantity() { return this.quantity; }

    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setPrice(int price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Default Constructor
    public Kiosk() {}

    // Parameterized Constructor
    public Kiosk(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Methods
    // [ METHOD ]: Simulate an item purchase /w necessary validation checks
    public void purchaseItem(int quantity) {
        // Checks if kiosk has enough stocks
        if (getQuantity() == 0)
            System.out.println("ERROR: No more stocks left.");

        // Deducts the purchased quantity if available
        else {
            setQuantity(getQuantity() - quantity);
            // Prints a message confirming the purchaseor showing inefficient stock
            System.out.println("SUCCESS: You have successfully purchased the item!");
        }

    }
}