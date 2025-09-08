package Lab_Activity_4_Lotto;
public class Player {
    // Attributes
    private String name;
    private int age;

    // Getters & Setters
    public String getName() { return this.name; }
    public int getAge() { return this.age; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    // Default Constructor
    public Player() {}
    
    // Constructor
    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
}
