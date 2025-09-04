public class Car {
    // ATTRIBUTES
    private String brand;
    private String model;
    private int year;
    private boolean isRunning;

    // Getters
    public String getBrand() { return this.brand; }
    public String getModel() { return this.model; }
    public int getYear() { return this.year; }
    public boolean getRunningStatus() { return this.isRunning; }

    // Setters
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }

    // Default Constructor
    public Car() {}

    // Parameterized Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // METHODS
    public void startEngine() {
        this.isRunning = true;
        System.out.printf("The %s %s engine has started.\n", getBrand(), getModel());
    }

    public void stopEngine() {
        isRunning = false;
        System.out.printf("The %s %s engine has stopped.\n", getBrand(), getModel());
    }

    public void displayInfo() {
        System.out.println("[ CAR INFORMATION ]");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Running Status: " + (getRunningStatus() ? "" : "Not") + " running");
    }
}
