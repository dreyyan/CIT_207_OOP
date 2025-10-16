class Animal {
    protected String name;

    // Super Constructor
    public Animal(String name) { this.name = name; }
    public String getAnimalName() { return this.name; }

    // Methods
    public void eat() {
        System.out.printf("The %s is eating...\n", name);
    }
    public void makeSound() {}
}

class Dog extends Animal {
    public Dog(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.printf("The %s barks.\n", name);
    }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.printf("The %s meows.\n", name);
    }
}

class Cow extends Animal {
    public Cow(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.printf("The %s moos.\n", name);
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        // Animal => Dog
        Dog a = new Dog("Dog");
        a.eat();
        a.makeSound();
        
        // Animal => Cat
        Cat b = new Cat("Cat");
        b.eat();
        b.makeSound();

        // Animal => Cow
        Cow c = new Cow("Cow");
        c.eat();
        c.makeSound();
    }
}