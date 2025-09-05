public class Main {
    public static void main(String[] args) {
        // Create a 'Car' object
        Car car = new Car("Toyota", "Corolla", 2020); 

        // display information
        car.displayInfo();

        // call startEngine()
        car.startEngine();

        // display information again
        car.displayInfo();

        // call stopEngine()
        car.stopEngine();
        
        // change car's model using setter
        car.setModel("Mitsubishi");
     
        // display info one final time
        car.displayInfo();
    }
}