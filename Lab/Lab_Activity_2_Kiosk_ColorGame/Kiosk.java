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
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setPrice(double price) {
        if (price < 0)
            System.out.println("ERROR: Negative price is not allowed");
        else
            this.price = price;
    }
    public void setQuantity(int quantity) {
        if (quantity < 0)
            System.out.println("ERROR: Negative quantity is not allowed");
        else
            this.quantity = quantity;
    }

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
        // Checks if kiosk has enough stock
        if (getQuantity() == 0)
            System.out.println("ERROR: No more stocks left");

        // Deducts the purchased quantity if available
        else {
            setQuantity(this.quantity - quantity);
            // Prints a message confirming the purchase or showing inefficient stock
            System.out.println("SUCCESS: You have successfully purchased the item!");
        }
    }
}
