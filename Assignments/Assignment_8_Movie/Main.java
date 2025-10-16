import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    // Predefined title and duration of movies
    // Predefined price, varies based on ticket

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 'Theatre' object
        Theatre SMCinema = new Theatre("SM Cinema", 50);

        // Add 10 pre-defined movies
        SMCinema.addMovies();

        // This loop runs indefinitely until system exits
        while (true) {
            // This loop runs until a user picks a valid choice
            while (true) {
                // Display UI
                Utility.clearScreen();
                Utility.printAnimated("                 [ Movie Theatre ]\n", 150);
                Utility.displayLine(50, "=");
                Utility.printAnimated("[1] View Movies\n", 150);
                Utility.printAnimated("[2] Select Movie\n", 150);
                Utility.printAnimated("[3] Exit\n", 150);
                Utility.displayLine(50, "=");

                // Prompt user to enter choice
                int choice = -1;
                try {
                    System.out.print("Enter choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice > 0 && choice < 4) Utility.clearScreen();
                    else System.out.println("ERROR: Invalid input, please enter a valid choice");
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: " + e);
                    scanner.nextLine();
                }

                // Do operation based on user choice
                switch (choice) {
                    case 1 -> SMCinema.viewMovies();
                    case 2 -> SMCinema.selectMovie();
                    case 3 -> {
                        System.out.println("* exiting system... *");
                        System.exit(0); // Exit the system
                    }
                    default -> System.out.println("ERROR: Invalid input, please enter a valid choice");
                }
            }
        }
    }
}