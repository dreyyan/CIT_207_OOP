class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving...");
    }
}

class Bicycle extends Vehicle {
    public void pedal() {
        System.out.println("Bicycle is pedaled.");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.move();
        b.pedal();
    }
}