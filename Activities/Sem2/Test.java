abstract class Animal {
    // Concrete method (has implementation)
    void eat() {
        System.out.println("This animal eats food.");
    }

    // Abstract method (no implementation)
    abstract void makeSound();
}

class Dog extends Animal {
    // Must implement the abstract method
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class Test {
    public static void main(String[] args) {
        // Animal a = new Animal(); Error: Cannot instantiate abstract class
        Dog d = new Dog();
        d.eat();                    // Inherited from Animal
        d.makeSound();              // Implemented by Dog
    }
}