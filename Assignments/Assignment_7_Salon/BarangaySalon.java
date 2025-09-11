import java.util.ArrayList;

public class BarangaySalon {
    // Attributes
    private String salonName;
    private ArrayList<Customer> customers = new ArrayList<>();

    // Constructor
    public BarangaySalon() {}
    public BarangaySalon(String salonName) { this.salonName = salonName; }

    // Getters & Setters
    public String getSalonName() { return this.salonName; }
    public void setSalonName(String salonName) { this.salonName = salonName; }

    // Methods
    public void addCustomer(Customer customer) { customers.add(customer); }

    public void displayCustomers() {
        int count = 1;
        System.out.printf("[ %s - CUSTOMERS ]\n", getSalonName());
        for (Customer customer : customers) {
            System.out.printf("%d. %s [%s]\n", count++, customer.getName(), customer.getServiceAvailed());
        }
    }
}
