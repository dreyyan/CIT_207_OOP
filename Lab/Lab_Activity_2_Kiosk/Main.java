public class Main {
    public static void main(String[] args) {
        // Instantiate a 'Kiosk' object
        Kiosk kiosk1 = new Kiosk("Kiosk #1", 100, 2);

        // Display current values
        System.out.println("BEFORE");
        System.out.println("Item Name: " + kiosk1.getItemName());
        System.out.println("Price: $" + kiosk1.getPrice());
        System.out.println("Quantity: " + kiosk1.getQuantity());
   
        // Simulate at least one purchase transaction
        kiosk1.purchaseItem(2);

        // Use setters to update details
        kiosk1.setItemName("Orange");
        kiosk1.setPrice(30);

        // Display values using getters
        System.out.println("AFTER");
        System.out.println("Item Name: " + kiosk1.getItemName());
        System.out.println("Price: $" + kiosk1.getPrice());
        System.out.println("Quantity: " + kiosk1.getQuantity());
    }
}
