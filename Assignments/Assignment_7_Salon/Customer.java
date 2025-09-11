public class Customer {
    // Attributes
    private String name;
    private String serviceAvailed;

    // Constructor
    public Customer(String name, String serviceAvailed) {
        this.name = name;
        this.serviceAvailed = serviceAvailed;
    }

    // Getters & Setters
    public String getName() { return this.name; }
    public String getServiceAvailed() { return this.serviceAvailed; }

    public void setName(String name) { this.name = name; }
    public void setServiceAvailed(String serviceAvailed) { this.serviceAvailed = serviceAvailed; }
}
